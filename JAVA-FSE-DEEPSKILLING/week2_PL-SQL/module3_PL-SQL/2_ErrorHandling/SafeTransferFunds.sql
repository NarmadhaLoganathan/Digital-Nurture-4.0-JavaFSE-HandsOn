CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    p_fromAccountID IN NUMBER,
    p_toAccountID IN NUMBER,
    p_amount IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    -- Check balance of sender
    SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_fromAccountID;

    -- Validate balance
    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Deduct from sender
    UPDATE Accounts SET Balance = Balance - p_amount WHERE AccountID = p_fromAccountID;

    -- Add to receiver
    UPDATE Accounts SET Balance = Balance + p_amount WHERE AccountID = p_toAccountID;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
    
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error during transfer: ' || SQLERRM);
END;
/

BEGIN
  SafeTransferFunds(1, 2, 200); -- will transfer ₹200 from Account 1 to 2
END;
/
BEGIN
  SafeTransferFunds(1, 2, 99999); -- should raise 'Insufficient balance'
END;
/
SELECT * FROM Accounts;
