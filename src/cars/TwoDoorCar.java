package cars;

public abstract class TwoDoorCar implements Car {
    private String model;
    private int year;

    public TwoDoorCar(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void run() {
        System.out.println("The two-door car is running.");
    }

    @Override
    public void stop() {
        System.out.println("The two-door car has stopped.");
    }

    @Override
    public void repair() {
        System.out.println("The two-door car is being repaired.");
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Abstract method for child classes to implement specific behavior
    public abstract void specificFeature();
}

