package cars;

public class FourDoorToyota extends FourDoorCar {

    public FourDoorToyota(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("Toyota's unique safety features.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing Toyota with genuine Toyota parts.");
    }

    @Override
    public String toString() {
        return "FourDoorToyota: Model = " + model + ", Year = " + year + ", Mileage = " + mileage + "km, Power = " + power + "hp";
    }
}
