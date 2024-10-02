package animals;

// Subclass Cat that inherits from Animal
class Cat extends Animal {
    // Constructor
    public Cat(String name, int age) {
        super(name, age);
    }

    // Implementing abstract method from Animal class
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

