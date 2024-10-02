package animals;

// Subclass Bird that inherits from Animal
class Bird extends Animal {
    // Constructor
    public Bird(String name, int age) {
        super(name, age);
    }

    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Tweet!");
    }
}

