package animals;

// Abstract class Animal
abstract class Animal {
    String name;

    // Constructor for Animal
    public Animal(String name) {
        this.name = name;
    }

    // Concrete method for action
    public void action() {
        System.out.println(name + " is eating");
    }
}

