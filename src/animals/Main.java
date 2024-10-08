package animals;

// CarTester class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Create objects of Dog, Cat, and Lion classes
        Dog dog = new Dog("Tarzan");
        Cat cat = new Cat("Garfield");
        Lion lion = new Lion("Simba");

        // Use action method
        dog.action();  // Output: Dog is eating
        cat.action();  // Output: Cat is eating
        lion.action(); // Output: Lion is eating
    }
}
