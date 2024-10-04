package workers;

public class Man extends Person {

    // Constructor
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is a man and working.");
    }
}
