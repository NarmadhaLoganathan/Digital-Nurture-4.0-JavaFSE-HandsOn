public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012", "Narmadha"));
        context.payBill(1500.00);

       
        context.setPaymentStrategy(new PayPalPayment("narmadha@example.com"));
        context.payBill(2200.50);
    }
}
