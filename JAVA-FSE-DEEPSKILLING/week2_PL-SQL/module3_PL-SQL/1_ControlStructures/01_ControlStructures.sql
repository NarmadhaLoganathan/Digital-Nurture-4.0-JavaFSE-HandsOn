-- Scenario 1: Apply 1% interest discount to loans of customers aged above 60
BEGIN
  FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
    IF TRUNC(MONTHS_BETWEEN(SYSDATE, cust_rec.DOB) / 12) > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = cust_rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 2: Promote customers to VIP based on balance
-- Add IsVIP column separately to avoid UPDATE error

BEGIN
  BEGIN
    EXECUTE IMMEDIATE 'ALTER TABLE Customers ADD IsVIP VARCHAR2(5)';
  EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE != -01430 THEN -- -01430 = column already exists
        RAISE;
      END IF;
  END;

  FOR vip_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
    IF vip_rec.Balance > 10000 THEN
      EXECUTE IMMEDIATE 'UPDATE Customers SET IsVIP = ''TRUE'' WHERE CustomerID = :1'
      USING vip_rec.CustomerID;
    END IF;
  END LOOP;
  COMMIT;
END;
/

-- Scenario 3: Print reminders for loans due within next 30 days
SET SERVEROUTPUT ON;
BEGIN
  FOR loan_rec IN (
    SELECT C.Name, L.EndDate
    FROM Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    WHERE L.EndDate <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: ' || loan_rec.Name || '''s loan is due on ' || TO_CHAR(loan_rec.EndDate, 'DD-Mon-YYYY'));
  END LOOP;
END;
/

SELECT * FROM Loans;
SELECT CustomerID, Name, Balance, IsVIP FROM Customers;



