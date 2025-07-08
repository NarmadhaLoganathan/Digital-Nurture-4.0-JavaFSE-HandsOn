public class FinancialForecast {

    
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return calculateFutureValue(principal, rate, years - 1) * (1 + rate);
    }

    public static double calculateFutureValueIterative(double principal, double rate, int years) {
        for (int i = 0; i < years; i++) {
            principal *= (1 + rate);
        }
        return principal;
    }
}
