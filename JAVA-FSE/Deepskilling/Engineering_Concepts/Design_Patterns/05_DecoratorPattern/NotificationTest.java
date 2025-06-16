public class NotificationTest {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier(basicNotifier);
        Notifier fullNotifier = new SlackNotifier(smsNotifier);

        fullNotifier.send("Server is down!");
    }
}
