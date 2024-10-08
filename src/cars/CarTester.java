package cars;

public class CarTester {

    public static void main(String[] args) {
        Car toyota = new FourDoorToyota("Camry", 2015, 60000, 180);
        Car bmw = new TwoDoorBMW("Z4", 2018, 30000, 250);

        // Testing the sell() method
        System.out.println("Toyota Camry selling price: $" + toyota.sell(2024, 70000, 190));
        System.out.println("BMW Z4 selling price: $" + bmw.sell(2024, 40000, 260));
    }
}
