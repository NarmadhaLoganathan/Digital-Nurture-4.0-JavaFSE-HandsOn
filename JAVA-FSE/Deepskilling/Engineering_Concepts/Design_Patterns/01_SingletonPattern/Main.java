public class Main {
    public static void main(String[] args) {
        // Get the first instance of Logger
        Logger loggerOne = Logger.getInstance();
        loggerOne.logMessage("First log entry");

        // Get the second instance of Logger
        Logger loggerTwo = Logger.getInstance();
        loggerTwo.logMessage("Second log entry");

        // Validate that both references are the same
        if (loggerOne == loggerTwo) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances found!");
        }
    }
}
