package interfaces;

// Lion class implementing the Animal interface
class Lion implements Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    // Getter function for name
    public String getName(){
        return this.name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking water from the river.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the savannah.");
    }

    @Override
    public void workout() {
        System.out.println(name + " is chasing prey.");
    }
}
