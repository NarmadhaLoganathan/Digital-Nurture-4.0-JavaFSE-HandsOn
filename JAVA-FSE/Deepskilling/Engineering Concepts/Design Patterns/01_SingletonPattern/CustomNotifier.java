public class CustomNotifier {
    
    private static CustomNotifier singleNotifier;

    private CustomNotifier() {
        System.out.println(" Notifier is now active.");
    }


    public static CustomNotifier connect() {
        if (singleNotifier == null) {
            singleNotifier = new CustomNotifier();
        }
        return singleNotifier;
    }

   
    public void notifyUser(String content) {
        System.out.println(" Notification: " + content);
    }
}
