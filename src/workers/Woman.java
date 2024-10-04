package workers;

public class Woman extends Person {

    // Constructor
    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is a woman and can work.");
    }
}
