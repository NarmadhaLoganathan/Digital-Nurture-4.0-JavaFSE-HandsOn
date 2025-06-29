-- Scenario 2: Log Transactions to AuditLog table


BEGIN
    EXECUTE IMMEDIATE '
    CREATE TABLE AuditLog (
        LogID NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
        AccountID NUMBER,
        Action VARCHAR2(20),
        ActionDate DATE
    )';
EXCEPTION
    WHEN OTHERS THEN
        IF SQLCODE != -955 THEN 
            RAISE;
        END IF;
END;
/


CREATE OR REPLACE TRIGGER LogTransaction
AFTER INSERT ON Transactions
FOR EACH ROW
BEGIN
    INSERT INTO AuditLog (AccountID, Action, ActionDate)
    VALUES (:NEW.AccountID, 'INSERT', SYSDATE);
END;
/
INSERT INTO Transactions (TransactionID, AccountID, TransactionDate, Amount, TransactionType)
VALUES (3, 1, SYSDATE, 200, 'Deposit');

SELECT * FROM AuditLog;
