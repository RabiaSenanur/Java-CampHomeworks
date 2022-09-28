public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println("Worker worked");
    }

    @Override
    public void eat() {
        System.out.println("Worker ");
    }

    @Override
    public void pay() {
        System.out.println("");
    }
}
