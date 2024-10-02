package interfaces;

// Dog class implementing the Animal interface
class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    // Getter function for name
    public String getName(){
        return this.name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking water.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the kennel.");
    }

    @Override
    public void workout() {
        System.out.println(name + " is running in the park.");
    }
}

