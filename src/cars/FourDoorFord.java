package cars;

public class FourDoorFord extends FourDoorCar {

    public FourDoorFord(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
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
