public class RobotWorker implements IWorkable,IMaintainable{
    @Override
    public void work() {
        System.out.println("Robotworker was worked");
    }

    @Override
    public void maintain() {
        System.out.println("Robotworker was maintained");
    }
}
