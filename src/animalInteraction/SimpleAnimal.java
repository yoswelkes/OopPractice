package animalInteraction;

import java.util.ArrayList;
import java.util.List;

public abstract class SimpleAnimal implements AnimalInteraction {
    // List to store interaction history
    protected List<String> interactionHistory;

    public SimpleAnimal() {
        this.interactionHistory = new ArrayList<>();
    }

    // Implement the feed method
    @Override
    public void feed(String food) {
        interactionHistory.add("Fed with " + food);
        System.out.println("Feeding the animal with " + food);
    }

    // Implement the play method
    @Override
    public void play() {
        interactionHistory.add("Played with the animal");
        System.out.println("Playing with the animal.");
    }

    // Implement the showInteractionHistory method
    @Override
    public void showInteractionHistory() {
        System.out.println("Interaction History:");
        for (String interaction : interactionHistory) {
            System.out.println(interaction);
        }
    }

    // Bonus: Method to log sleep interaction
    public void sleep(int hours) {
        interactionHistory.add("Slept for " + hours + " hours");
        System.out.println("The animal slept for " + hours + " hours.");
    }
}
