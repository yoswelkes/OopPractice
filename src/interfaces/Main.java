package interfaces;

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Lion
        Dog dog = new Dog("Odi");
        Cat cat = new Cat("Garfield");
        Lion lion = new Lion("Simba");

        // Calling actions on Dog
        System.out.println("Dog " + dog.getName() + "'s Actions:");
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.workout();

        // Calling actions on Cat
        System.out.println("\nCat " + cat.getName() + "'s Actions:");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.workout();

        // Calling actions on Lion
        System.out.println("\nLion " + lion.getName() + "'s Actions:");
        lion.eat();
        lion.drink();
        lion.sleep();
        lion.workout();
    }
}
