package animalInteraction;

public class InteractionTester {
    public static void main(String[] args) {
        // Create a Dog instance
        Dog dog = new Dog();
        dog.feed("dog food");
        dog.play();
        dog.bark();
        dog.sleep(5);
        dog.showInteractionHistory();  // Show Dog's interaction history

        System.out.println(); // Add a line break for separation

        // Create a Cat instance
        Cat cat = new Cat();
        cat.feed("cat food");
        cat.play();
        cat.meow();
        cat.sleep(7);
        cat.showInteractionHistory();  // Show Cat's interaction history
    }
}
