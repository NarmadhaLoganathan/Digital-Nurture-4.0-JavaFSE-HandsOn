-- Scenario 1: Package - CustomerManagement
CREATE OR REPLACE PACKAGE CustomerManagement AS
    PROCEDURE AddCustomer(id NUMBER, name VARCHAR2, dob DATE, balance NUMBER);
    PROCEDURE UpdateCustomer(id NUMBER, name VARCHAR2, balance NUMBER);
    FUNCTION GetBalance(id NUMBER) RETURN NUMBER;
END CustomerManagement;
/

CREATE OR REPLACE PACKAGE BODY CustomerManagement AS
    PROCEDURE AddCustomer(id NUMBER, name VARCHAR2, dob DATE, balance NUMBER) IS
    BEGIN
        INSERT INTO Customers(CustomerID, Name, DOB, Balance, LastModified)
        VALUES (id, name, dob, balance, SYSDATE);
    END;

    PROCEDURE UpdateCustomer(id NUMBER, name VARCHAR2, balance NUMBER) IS
    BEGIN
        UPDATE Customers
        SET Name = name, Balance = balance, LastModified = SYSDATE
        WHERE CustomerID = id;
    END;

    FUNCTION GetBalance(id NUMBER) RETURN NUMBER IS
        cust_balance NUMBER;
    BEGIN
        SELECT Balance INTO cust_balance FROM Customers WHERE CustomerID = id;
        RETURN cust_balance;
    END;
END CustomerManagement;
/

-- Scenario 2: Package - EmployeeManagement
CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(id NUMBER, name VARCHAR2, position VARCHAR2,
                           salary NUMBER, dept VARCHAR2, hiredate DATE);
    PROCEDURE UpdateSalary(id NUMBER, salary NUMBER);
    FUNCTION AnnualSalary(id NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
    PROCEDURE HireEmployee(id NUMBER, name VARCHAR2, position VARCHAR2,
                           salary NUMBER, dept VARCHAR2, hiredate DATE) IS
    BEGIN
        INSERT INTO Employees(EmployeeID, Name, Position, Salary, Department, HireDate)
        VALUES (id, name, position, salary, dept, hiredate);
    END;

    PROCEDURE UpdateSalary(id NUMBER, salary NUMBER) IS
    BEGIN
        UPDATE Employees SET Salary = salary WHERE EmployeeID = id;
    END;

    FUNCTION AnnualSalary(id NUMBER) RETURN NUMBER IS
        total NUMBER;
    BEGIN
        SELECT Salary * 12 INTO total FROM Employees WHERE EmployeeID = id;
        RETURN total;
    END;
END EmployeeManagement;
/

-- Scenario 3: Package - AccountOperations
CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(id NUMBER, cust_id NUMBER, type VARCHAR2, balance NUMBER);
    PROCEDURE CloseAccount(id NUMBER);
    FUNCTION TotalBalance(cust_id NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount(id NUMBER, cust_id NUMBER, type VARCHAR2, balance NUMBER) IS
    BEGIN
        INSERT INTO Accounts(AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (id, cust_id, type, balance, SYSDATE);
    END;

    PROCEDURE CloseAccount(id NUMBER) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = id;
    END;

    FUNCTION TotalBalance(cust_id NUMBER) RETURN NUMBER IS
        total NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO total FROM Accounts WHERE CustomerID = cust_id;
        RETURN total;
    END;
END AccountOperations;
/

-- Show output for Customer Balance
SET SERVEROUTPUT ON;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Customer Balance: ' || CustomerManagement.GetBalance(1));
END;
/

-- Show Annual Salary of Employee
BEGIN
    DBMS_OUTPUT.PUT_LINE('Annual Salary: ' || EmployeeManagement.AnnualSalary(1));
END;
/

-- Show Total Balance of Accounts for a customer
BEGIN
    DBMS_OUTPUT.PUT_LINE('Total Account Balance: ' || AccountOperations.TotalBalance(1));
END;
/
