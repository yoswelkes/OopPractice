package workers;

public abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to be implemented by subclasses
    public abstract void work();

    // Display person info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
