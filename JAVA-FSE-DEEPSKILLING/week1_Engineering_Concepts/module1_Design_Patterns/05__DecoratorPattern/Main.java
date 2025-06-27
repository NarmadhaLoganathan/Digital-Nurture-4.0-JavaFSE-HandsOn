public class Main {
    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsAndEmail = new SMSNotifierDecorator(emailNotifier);


        Notifier fullNotifier = new SlackNotifierDecorator(smsAndEmail);

        fullNotifier.send("System Alert: High CPU usage detected!");
    }
}
