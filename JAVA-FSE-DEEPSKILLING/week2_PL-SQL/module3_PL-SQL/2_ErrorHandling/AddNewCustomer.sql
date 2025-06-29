CREATE OR REPLACE PROCEDURE AddNewCustomer (
    p_customerID IN NUMBER,
    p_name IN VARCHAR2,
    p_dob IN DATE,
    p_balance IN NUMBER
) AS
BEGIN
    INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
    VALUES (p_customerID, p_name, p_dob, p_balance, SYSDATE);

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Customer added successfully.');
EXCEPTION
    WHEN DUP_VAL_ON_INDEX THEN
        DBMS_OUTPUT.PUT_LINE('Customer ID already exists.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error adding customer: ' || SQLERRM);
        ROLLBACK;
END;
/

COLUMN Name FORMAT A20
COLUMN DOB FORMAT A12
COLUMN Balance FORMAT 99999
COLUMN LastModified FORMAT A12
COLUMN IsVIP FORMAT A5

BEGIN
  AddNewCustomer(3, 'Kumar', TO_DATE('1995-01-10','YYYY-MM-DD'), 2000);
END;
/

SELECT * FROM Customers;
