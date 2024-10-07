package cars;

public class FourDoorFord extends FourDoorCar {

    public FourDoorFord(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("Ford's EcoBoost technology.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Ford with original Ford parts.");
    }
}
