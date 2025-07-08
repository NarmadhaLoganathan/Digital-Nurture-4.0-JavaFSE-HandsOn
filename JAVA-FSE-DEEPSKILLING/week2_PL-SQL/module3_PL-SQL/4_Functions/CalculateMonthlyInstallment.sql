-- Scenario 2: Calculate Monthly Loan Installment

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,  
    p_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_rate NUMBER;
    v_months NUMBER;
    v_installment NUMBER;
BEGIN
    v_monthly_rate := p_interest_rate / (12 * 100);
    v_months := p_years * 12;

    v_installment := p_loan_amount * v_monthly_rate / 
                     (1 - POWER(1 + v_monthly_rate, -v_months));

    RETURN ROUND(v_installment, 2);
END;
/

SELECT CalculateMonthlyInstallment(50000, 5, 5) AS Monthly_Installment FROM dual;
