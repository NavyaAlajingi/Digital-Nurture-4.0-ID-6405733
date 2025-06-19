import java.time.LocalDateTime;

public class Logger {
    private static volatile Logger instance;

    private Logger() {
        System.out.println(" Logger initialized at " + LocalDateTime.now());
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "] LOG: " + message);
    }
}
