package interfaces;

// Cat class implementing the Animal interface
class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    // Getter function for name
    public String getName(){
        return this.name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking milk.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping on the couch.");
    }

    @Override
    public void workout() {
        System.out.println(name + " is climbing the scratching post.");
    }
}

