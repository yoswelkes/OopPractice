package cars.dealers;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealers {

    private ArrayList<Dealer> dealerList;

    // Constructor
    public Dealers() {
        this.dealerList = new ArrayList<>();
    }

    // Method to add a new dealer
    public void addDealer(Dealer dealer) {
        dealerList.add(dealer);
    }

    // Method to show all dealers
    public void showDealers() {
        if (dealerList.isEmpty()) {
            System.out.println("No dealers available.");
        } else {
            for (int i = 0; i < dealerList.size(); i++) {
                System.out.println((i + 1) + ". " + dealerList.get(i).getDealerInfo());
            }
        }
    }

    // Main menu to manage dealers
    public void dealersMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Dealers Menu ---");
            System.out.println("1. Show Existing Dealers");
            System.out.println("2. Create New Dealer");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    showDealers();
                    if (!dealerList.isEmpty()) {
                        System.out.print("Enter the number of the dealer to manage: ");
                        int dealerNumber = scanner.nextInt();
                        if (dealerNumber > 0 && dealerNumber <= dealerList.size()) {
                            Dealer selectedDealer = dealerList.get(dealerNumber - 1);
                            selectedDealer.dealerMenu();  // Enter dealer's menu
                        } else {
                            System.out.println("Invalid dealer number.");
                        }
                    }
                    break;
                case 2:
                    createNewDealer(scanner);
                    break;
                case 3:
                    System.out.println("Exiting Dealers Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    // Method to create a new dealer
    private void createNewDealer(Scanner scanner) {
        System.out.print("Enter dealer name: ");
        String dealerName = scanner.nextLine();

        System.out.println("Enter the initial balance");
        double initialMoney = scanner.nextDouble();
        Dealer newDealer = new Dealer(dealerName, initialMoney);
        addDealer(newDealer);
        System.out.println("Dealer " + dealerName + " created successfully!");
    }
}
