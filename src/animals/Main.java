package animals;

// Testing the classes
public class Main {
    public static void main(String[] args) {
        // Cannot create an instance of the abstract class Animal
        // Animal animal = new Animal("Generic Animal", 5); // This will cause an error!

        // Create instances of the subclasses
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        // Calling methods on the objects
        dog.eat();   // Buddy is eating.
        dog.makeSound();  // Buddy says: Woof Woof!

        cat.eat();   // Whiskers is eating.
        cat.makeSound();  // Whiskers says: Meow!

        bird.eat();   // Tweety is eating.
        bird.makeSound();  // Tweety says: Tweet!
    }
}
