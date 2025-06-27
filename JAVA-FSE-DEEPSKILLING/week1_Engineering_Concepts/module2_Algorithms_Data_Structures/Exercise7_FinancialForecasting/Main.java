public class Main {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.10;
        int years = 5;

        double future = FinancialForecast.calculateFutureValue(principal, rate, years);
      System.out.printf("Future Value (Recursive): Rs.%.2f\n", future);




        double futureIterative = FinancialForecast.calculateFutureValueIterative(principal, rate, years);
        System.out.printf("Future Value (Iterative): Rs.%.2f\n", futureIterative);

    }
}
