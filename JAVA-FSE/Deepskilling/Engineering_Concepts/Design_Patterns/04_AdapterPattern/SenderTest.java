public class SenderTest {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailAdapter(new EmailService());
        emailSender.send("Hello from Email!");

        MessageSender smsSender = new SmsAdapter(new SmsService());
        smsSender.send("Hello from SMS!");
    }
}
