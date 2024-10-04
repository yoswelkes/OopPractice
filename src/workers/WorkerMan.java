package workers;

public class WorkerMan extends Man {
    private int workingHours;

    // Constructor
    public WorkerMan(String name, int age, int workingHours) {
        super(name, age);
        this.workingHours = workingHours;
    }

    // Getter for working hours
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void work() {
        System.out.println(getName() + " worked " + workingHours + " hours.");
    }
}
