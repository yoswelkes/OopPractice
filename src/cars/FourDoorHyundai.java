package cars;

public class FourDoorHyundai extends FourDoorCar {

    public FourDoorHyundai(String model, int year) {
        super(model, year);
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
