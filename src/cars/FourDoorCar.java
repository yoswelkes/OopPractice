package cars;

public abstract class FourDoorCar implements Car {
    protected String model;
    protected int year;
    protected int mileage;
    protected int power;

    public FourDoorCar(String model, int year, int mileage, int power) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }

    @Override
    public double sell(int year, int mileage, int power) {
        // Example fictitious formula for FourDoorCar: base price decreases with mileage and year
        double basePrice = 20000;
        double depreciation = (year - this.year) * 500 + mileage * 0.1;
        return Math.max(basePrice - depreciation + power * 50, 1000);  // Minimum price set to 1000
    }

    @Override
    public void run() {
        System.out.println("The four-door car is running.");
    }

    @Override
    public void stop() {
        System.out.println("The four-door car has stopped.");
    }

    @Override
    public void repair() {
        System.out.println("The four-door car is being repaired.");
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
