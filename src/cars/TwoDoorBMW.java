package cars;

public class TwoDoorBMW extends TwoDoorCar {

    public TwoDoorBMW(String model, int year) {
        super(model, year);
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
