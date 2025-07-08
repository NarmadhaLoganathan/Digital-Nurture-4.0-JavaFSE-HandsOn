-- Scenario 1: Generate monthly statements for all customers
BEGIN
    DBMS_OUTPUT.PUT_LINE('--- Monthly Statements ---');
    FOR trans IN (
        SELECT c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE TO_CHAR(t.TransactionDate, 'MM-YYYY') = TO_CHAR(SYSDATE, 'MM-YYYY')
        ORDER BY c.Name
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Customer: ' || trans.Name ||
                             ' | Date: ' || TO_CHAR(trans.TransactionDate, 'DD-Mon-YYYY') ||
                             ' | Amount: ' || trans.Amount ||
                             ' | Type: ' || trans.TransactionType);
    END LOOP;
END;
/

-- Scenario 2: Apply annual fee to all accounts
DECLARE
    CURSOR account_cursor IS
        SELECT AccountID FROM Accounts;
    fee CONSTANT NUMBER := 100;
BEGIN
    FOR acc IN account_cursor LOOP
        UPDATE Accounts
        SET Balance = Balance - fee
        WHERE AccountID = acc.AccountID;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Annual maintenance fee applied to all accounts.');
END;
/

-- Scenario 3: Update interest rate for all loans
DECLARE
    CURSOR loan_cursor IS
        SELECT LoanID FROM Loans;
    updated_rate CONSTANT NUMBER := 6.5;
BEGIN
    FOR loan IN loan_cursor LOOP
        UPDATE Loans
        SET InterestRate = updated_rate
        WHERE LoanID = loan.LoanID;
    END LOOP;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Loan interest rates updated successfully.');
END;
/
