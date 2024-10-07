package cars;

public class TwoDoorFord extends TwoDoorCar {

    public TwoDoorFord(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("Ford's iconic Mustang two-door design.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door Ford with Mustang parts.");
    }
}
