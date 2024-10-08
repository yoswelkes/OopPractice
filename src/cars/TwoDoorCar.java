package cars;

public abstract class TwoDoorCar implements Car {
    protected String model;
    protected int year;
    protected int mileage;
    protected int power;

    public TwoDoorCar(String model, int year, int mileage, int power) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }

    @Override
    public double sell(int year, int mileage, int power) {
        // Example fictitious formula for TwoDoorCar: price decreases faster with mileage and power
        double basePrice = 25000;
        double depreciation = (year - this.year) * 700 + mileage * 0.2;
        return Math.max(basePrice - depreciation + power * 40, 1500);  // Minimum price set to 1500
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
