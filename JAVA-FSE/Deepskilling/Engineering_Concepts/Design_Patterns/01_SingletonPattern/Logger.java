public class Logger {

    // Private static instance of Logger
    private static Logger singleInstance;

    // Private constructor to prevent external instantiation
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Public static method to get the singleton instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Method to log messages
    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }
}
