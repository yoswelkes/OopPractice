package animals;

// Abstract class Animal
public abstract class Animal {
    // Fields common to all animals
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Concrete method (common to all animals)
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void makeSound();

    // Getters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal Name: " + name + ", Age: " + age;
    }
}

