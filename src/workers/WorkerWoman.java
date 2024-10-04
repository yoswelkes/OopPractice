package workers;

public class WorkerWoman extends Woman {
    private int workingHours;

    // Constructor
    public WorkerWoman(String name, int age, int workingHours) {
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
