package cars;

public class FourDoorToyota extends FourDoorCar {

    public FourDoorToyota(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("Toyota's unique safety features.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Toyota with genuine Toyota parts.");
    }
}
