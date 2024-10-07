package cars;

public class Main {

    public static void main(String[] args) {

        // Testing Four-Door Cars
        System.out.println("=== Testing Four-Door Cars ===");
        FourDoorToyota fourDoorToyota = new FourDoorToyota("Camry", 2021);
        fourDoorToyota.run();
        fourDoorToyota.specificFeature();
        fourDoorToyota.repair();
        fourDoorToyota.stop();

        System.out.println();

        FourDoorBMW fourDoorBMW = new FourDoorBMW("Series 5", 2020);
        fourDoorBMW.run();
        fourDoorBMW.specificFeature();
        fourDoorBMW.repair();
        fourDoorBMW.stop();

        System.out.println();

        FourDoorFord fourDoorFord = new FourDoorFord("Fusion", 2019);
        fourDoorFord.run();
        fourDoorFord.specificFeature();
        fourDoorFord.repair();
        fourDoorFord.stop();

        System.out.println();

        FourDoorHyundai fourDoorHyundai = new FourDoorHyundai("Sonata", 2022);
        fourDoorHyundai.run();
        fourDoorHyundai.specificFeature();
        fourDoorHyundai.repair();
        fourDoorHyundai.stop();

        System.out.println();

        // Testing Two-Door Cars
        System.out.println("=== Testing Two-Door Cars ===");
        TwoDoorToyota twoDoorToyota = new TwoDoorToyota("86", 2021);
        twoDoorToyota.run();
        twoDoorToyota.specificFeature();
        twoDoorToyota.repair();
        twoDoorToyota.stop();

        System.out.println();

        TwoDoorBMW twoDoorBMW = new TwoDoorBMW("Z4", 2020);
        twoDoorBMW.run();
        twoDoorBMW.specificFeature();
        twoDoorBMW.repair();
        twoDoorBMW.stop();

        System.out.println();

        TwoDoorFord twoDoorFord = new TwoDoorFord("Mustang", 2019);
        twoDoorFord.run();
        twoDoorFord.specificFeature();
        twoDoorFord.repair();
        twoDoorFord.stop();

        System.out.println();

        TwoDoorHyundai twoDoorHyundai = new TwoDoorHyundai("Veloster", 2022);
        twoDoorHyundai.run();
        twoDoorHyundai.specificFeature();
        twoDoorHyundai.repair();
        twoDoorHyundai.stop();
    }
}
