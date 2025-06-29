CREATE OR REPLACE PROCEDURE UpdateSalary (
    p_empID IN NUMBER,
    p_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_percent / 100)
    WHERE EmployeeID = p_empID;

    IF SQL%ROWCOUNT = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID not found.');
    END IF;

    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Salary updated successfully.');
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/

BEGIN
  UpdateSalary(1, 10);  -- or any valid employee ID
END;
/


COLUMN Name FORMAT A20
COLUMN Position FORMAT A15
COLUMN Department FORMAT A10
COLUMN HireDate FORMAT A12
COLUMN DOB FORMAT A12


SELECT * FROM Employees WHERE EmployeeID = 1;
