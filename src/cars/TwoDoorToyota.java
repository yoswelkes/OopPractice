package cars;

public class TwoDoorToyota extends TwoDoorCar {

    public TwoDoorToyota(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("Toyota's compact two-door design with hybrid technology.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door Toyota with specialized parts.");
    }
}
