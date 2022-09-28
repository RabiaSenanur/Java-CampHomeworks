public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add(){
        System.out.println("Customer was added");
        this.baseLogger.log("log message");
    }
}
