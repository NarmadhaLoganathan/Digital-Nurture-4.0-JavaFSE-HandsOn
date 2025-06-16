public class Main {
    public static void main(String[] args) {
        
        Logger loggerOne = Logger.getInstance();
        loggerOne.logMessage("First log entry");

        Logger loggerTwo = Logger.getInstance();
        loggerTwo.logMessage("Second log entry");

       
        if (loggerOne == loggerTwo) {
            System.out.println("Both logger instances are the same.");
        } else {
            System.out.println("Different logger instances found!");
        }
    }
}
