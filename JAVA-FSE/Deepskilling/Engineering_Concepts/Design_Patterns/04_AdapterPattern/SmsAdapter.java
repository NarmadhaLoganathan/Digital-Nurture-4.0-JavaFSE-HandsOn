public class SmsAdapter implements MessageSender {
    private SmsService smsService;

    public SmsAdapter(SmsService smsService) {
        this.smsService = smsService;
    }

    public void send(String message) {
        smsService.sendText(message);
    }
}
