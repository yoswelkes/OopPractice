package cars;

public class FourDoorBMW extends FourDoorCar {

    public FourDoorBMW(String model, int year, int mileage, int power) {
        super(model, year, mileage, power);
    }

    @Override
    public void specificFeature() {
        System.out.println("BMW's advanced driving dynamics.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing BMW with certified German engineering parts.");
    }

    @Override
    public String toString() {
        return "FourDoorBMW: Model = " + model + ", Year = " + year + ", Mileage = " + mileage + "km, Power = " + power + "hp";
    }
}
