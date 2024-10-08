package cars;

public class TwoDoorHyundai extends TwoDoorCar {

    public TwoDoorHyundai(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("Hyundai's two-door efficiency with sporty appeal.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door Hyundai with original Hyundai parts.");
    }

    @Override
    public String toString() {
        return "TwoDoorHyundai: Model = " + model + ", Year = " + year + ", Mileage = " + mileage + "km, Power = " + power + "hp";
    }
}
