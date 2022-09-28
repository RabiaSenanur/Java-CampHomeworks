public class Main {
    public static void main(String[] args) {
        /*EmailLogger logger = new EmailLogger();
        logger.Log("Log message");*/

        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(), new EmailLogger()};
        for (BaseLogger logger:loggers) {
            logger.Log("Log message");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}