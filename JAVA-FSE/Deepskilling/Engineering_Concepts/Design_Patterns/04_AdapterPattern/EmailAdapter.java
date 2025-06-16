public class EmailAdapter implements MessageSender {
    private EmailService emailService;

    public EmailAdapter(EmailService emailService) {
        this.emailService = emailService;
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
