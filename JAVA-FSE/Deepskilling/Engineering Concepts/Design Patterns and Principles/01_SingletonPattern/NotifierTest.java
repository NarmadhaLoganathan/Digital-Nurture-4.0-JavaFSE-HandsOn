public class NotifierTest {
    public static void main(String[] args) {
       
        CustomNotifier first = CustomNotifier.connect();
        CustomNotifier second = CustomNotifier.connect();

      
        first.notifyUser("Welcome, Narmadha!");
        second.notifyUser("You have 3 new messages.");

        
        if (first == second) {
            System.out.println("✅ Single instance used across app.");
        } else {
            System.out.println("❌ Multiple instances created.");
        }
    }
}
