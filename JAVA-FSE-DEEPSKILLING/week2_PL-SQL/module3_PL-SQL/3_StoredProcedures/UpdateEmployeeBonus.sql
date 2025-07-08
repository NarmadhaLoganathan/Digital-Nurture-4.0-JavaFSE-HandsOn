-- Scenario 2: Update Employee Bonus by Department

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_dept IN VARCHAR2,
    p_bonus_pct IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_pct / 100)
    WHERE Department = p_dept;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department: ' || p_dept);
    ELSE
        COMMIT;
        DBMS_OUTPUT.PUT_LINE('Bonus updated for employees in department: ' || p_dept);
    END IF;
END;
/



BEGIN
  UpdateEmployeeBonus('IT', 10);  -- Example: 10% bonus for IT dept
END;
/

COLUMN EmployeeID FORMAT 999
COLUMN Name FORMAT A20
COLUMN Department FORMAT A15
COLUMN Salary FORMAT 999999

SELECT * FROM Employees WHERE Department = 'IT';
