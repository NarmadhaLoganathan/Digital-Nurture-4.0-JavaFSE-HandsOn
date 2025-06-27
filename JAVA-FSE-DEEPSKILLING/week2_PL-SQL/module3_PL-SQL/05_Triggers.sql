

-- Scenario 1: Update LastModified when Customer is updated

CREATE OR REPLACE TRIGGER UpdateCustomerLastModified
BEFORE UPDATE ON Customers
FOR EACH ROW
BEGIN
    :NEW.LastModified := SYSDATE;
END;
/


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


-- Scenario 3: Check Transaction Rules (no overdraft, positive deposit)

CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
    v_balance NUMBER;
BEGIN
    IF :NEW.TransactionType = 'Withdrawal' THEN
        SELECT Balance INTO v_balance
        FROM Accounts
        WHERE AccountID = :NEW.AccountID;

        IF :NEW.Amount > v_balance THEN
            RAISE_APPLICATION_ERROR(-20001, 'Withdrawal exceeds account balance');
        END IF;
    ELSIF :NEW.TransactionType = 'Deposit' THEN
        IF :NEW.Amount <= 0 THEN
            RAISE_APPLICATION_ERROR(-20002, 'Deposit amount must be positive');
        END IF;
    END IF;
END;
/
