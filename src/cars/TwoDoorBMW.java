package cars;

public class TwoDoorBMW extends TwoDoorCar {

    public TwoDoorBMW(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("BMW's sport-focused two-door performance.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door BMW with high-performance parts.");
    }
}
