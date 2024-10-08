package cars;

public class DealerTester {
    public static void main(String[] args) {
        // Create a dealer with an initial balance
        Dealer dealer = new Dealer("SuperCars", 50000.0);

        // Start dealer menu
        dealer.dealerMenu();
    }
}
