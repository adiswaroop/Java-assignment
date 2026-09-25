interface Logger {
    default void logInfo(String msg) {
        System.out.println(format(msg) + "[INFO] " + msg);
    }

    default void logError(String msg) {
        System.out.println(format(msg) + "[ERROR] " + msg);
    }

    private String format(String msg) {
        return "[LOG]: " ;
    }
}

class ConsoleLogger implements Logger {}

public class prog9 {
    public static void main(String[] args) {
        ConsoleLogger cl = new ConsoleLogger();
        cl.logInfo("Application Started Successfully");
        cl.logError("Failed to connect to DB");
    }

}