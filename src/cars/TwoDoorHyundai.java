package cars;

public class TwoDoorHyundai extends TwoDoorCar {

    public TwoDoorHyundai(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("Hyundai's two-door efficiency with sporty appeal.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door Hyundai with original Hyundai parts.");
    }
}
