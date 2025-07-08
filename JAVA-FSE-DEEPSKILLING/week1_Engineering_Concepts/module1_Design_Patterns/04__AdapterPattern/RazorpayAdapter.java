public class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway gateway) {
        this.razorpayGateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        razorpayGateway.pay(amount);
    }
}
