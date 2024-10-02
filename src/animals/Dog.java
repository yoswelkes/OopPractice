package animals;

// Subclass Dog that inherits from Animal
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

