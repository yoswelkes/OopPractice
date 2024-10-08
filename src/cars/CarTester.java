package cars;

public class CarTester {

    public static void main(String[] args) {
        // Testing Four-Door Cars
        FourDoorToyota toyota4 = new FourDoorToyota("Camry", 2020, 50000, 178);
        FourDoorBMW bmw4 = new FourDoorBMW("3 Series", 2019, 60000, 255);
        FourDoorFord ford4 = new FourDoorFord("Fusion", 2018, 75000, 175);
        FourDoorHyundai hyundai4 = new FourDoorHyundai("Elantra", 2021, 30000, 147);

        System.out.println(toyota4.toString());
        System.out.println(bmw4.toString());
        System.out.println(ford4.toString());
        System.out.println(hyundai4.toString());

        System.out.println();

        // Testing Two-Door Cars
        TwoDoorToyota toyota2 = new TwoDoorToyota("Supra", 2022, 15000, 382);
        TwoDoorBMW bmw2 = new TwoDoorBMW("M2", 2021, 20000, 405);
        TwoDoorFord ford2 = new TwoDoorFord("Mustang", 2020, 25000, 450);
        TwoDoorHyundai hyundai2 = new TwoDoorHyundai("Veloster", 2019, 40000, 201);

        System.out.println(toyota2.toString());
        System.out.println(bmw2.toString());
        System.out.println(ford2.toString());
        System.out.println(hyundai2.toString());

        /*
        Car toyota = new FourDoorToyota("Camry", 2015, 60000, 180);
        Car bmw = new TwoDoorBMW("Z4", 2018, 30000, 250);

        // Testing the sell() method
        System.out.println("Toyota Camry selling price: $" + toyota.sell(2024, 70000, 190));
        System.out.println("BMW Z4 selling price: $" + bmw.sell(2024, 40000, 260));
         */
    }
}
