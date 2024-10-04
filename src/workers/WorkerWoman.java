package workers;

public class WorkerWoman extends Woman {

    // Constructor
    public WorkerWoman(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is a working woman.");
    }
}
