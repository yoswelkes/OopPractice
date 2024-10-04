package workers;

public class WorkerMan extends Man {

    // Constructor
    public WorkerMan(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is a working man.");
    }
}
