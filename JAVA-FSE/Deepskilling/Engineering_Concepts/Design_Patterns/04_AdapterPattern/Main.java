public class Main {
    public static void main(String[] args) {
        // Using PayPal through Adapter
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        paypal.processPayment(1000);

        // Using Stripe through Adapter
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        stripe.processPayment(1500);

        // Using Razorpay through Adapter
        PaymentProcessor razorpay = new RazorpayAdapter(new RazorpayGateway());
        razorpay.processPayment(2000);
    }
}
