
-- Scenario 1: Calculate Age of Customer
CREATE OR REPLACE FUNCTION CalculateAge (
    p_dob IN DATE
) RETURN NUMBER IS
    v_age NUMBER;
BEGIN
    v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, p_dob) / 12);
    RETURN v_age;
END;
/
SELECT CalculateAge(TO_DATE('1995-01-10', 'YYYY-MM-DD')) AS Age FROM dual;
