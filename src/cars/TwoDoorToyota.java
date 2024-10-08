package cars;

public class TwoDoorToyota extends TwoDoorCar {

    public TwoDoorToyota(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("Toyota's compact two-door design with hybrid technology.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Two-Door Toyota with specialized parts.");
    }

    @Override
    public String toString() {
        return "TwoDoorToyota: Model = " + model + ", Year = " + year + ", Mileage = " + mileage + "km, Power = " + power + "hp";
    }
}
