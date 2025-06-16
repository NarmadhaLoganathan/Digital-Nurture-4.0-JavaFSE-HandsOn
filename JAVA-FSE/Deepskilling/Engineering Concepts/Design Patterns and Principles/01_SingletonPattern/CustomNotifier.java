public class CustomNotifier {
    // Unique variable name for singleton instance
    private static CustomNotifier singleNotifier;

    // Private constructor to block object creation
    private CustomNotifier() {
        System.out.println("📢 Notifier is now active.");
    }

    // Public method to get the only instance
    public static CustomNotifier connect() {
        if (singleNotifier == null) {
            singleNotifier = new CustomNotifier();
        }
        return singleNotifier;
    }

    // Custom method to send a message
    public void notifyUser(String content) {
        System.out.println("🔔 Notification: " + content);
    }
}
