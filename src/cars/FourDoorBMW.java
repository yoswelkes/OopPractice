package cars;

public class FourDoorBMW extends FourDoorCar {

    public FourDoorBMW(String model, int year) {
        super(model, year);
    }

    @Override
    public void specificFeature() {
        System.out.println("BMW's advanced driving dynamics.");
    }

    @Override
    public void repair() {
        System.out.println("Repairing BMW with certified German engineering parts.");
    }
}
