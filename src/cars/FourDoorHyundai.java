package cars;

public class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("Hyundai's advanced fuel efficiency.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Hyundai with original Hyundai parts.");
    }
}
