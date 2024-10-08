package cars;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealer {
    private double dealerMoney;
    private ArrayList<Car> cars;
    private String dealerName;

    // Constructor
    public Dealer(String dealerName, double initialMoney) {
        this.dealerName = dealerName;
        this.dealerMoney = initialMoney;
        this.cars = new ArrayList<>();
    }

    // Show all cars
    public void showAllCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("Cars in inventory:");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i).toString());
            }
        }
    }

    // Add car to the dealership
    public void addCar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car type (" +
                "1. FourDoorToyota, 2. FourDoorBMW, 3. FourDoorFord, 4. FourDoorHyundai, " +
                "5. TwoDoorToyota, 6. TwoDoorBMW, 7. TwoDoorFord, 8. TwoDoorHyundai" +
                "): ");
        int carType = scanner.nextInt();

        System.out.println("Enter model:");
        String model = scanner.next();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();

        System.out.println("Enter mileage: ");
        int mileage = scanner.nextInt();

        System.out.println("Enter power: ");
        int power = scanner.nextInt();

        Car car = null;

        switch (carType) {
            case 1:
                car = new FourDoorToyota(model, year, mileage, power);
                break;
            case 2:
                car = new FourDoorBMW(model, year, mileage, power);
                break;
            case 3:
                car = new FourDoorFord(model, year, mileage, power);
                break;
            case 4:
                car = new FourDoorHyundai(model, year, mileage, power);
                break;
            case 5:
                car = new TwoDoorToyota(model, year, mileage, power);
                break;
            case 6:
                car = new TwoDoorBMW(model, year, mileage, power);
                break;
            case 7:
                car = new TwoDoorFord(model, year, mileage, power);
                break;
            case 8:
                car = new TwoDoorHyundai(model, year, mileage, power);
                break;
            default:
                System.out.println("Invalid car type.");
                return;
        }

        cars.add(car);
        System.out.println("Car added successfully.");
    }

    // Sell car (search by index or any unique ID, remove and update storeMoney)
    public void sellCar() {
        if (cars.isEmpty()) {
            System.out.println("No cars to sell.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index of the car you want to sell (1-" + cars.size() + "):");
        int index = scanner.nextInt() - 1;

        // Ensure the index is valid
        if (index >= 0 && index < cars.size()) {
            Car carToSell = cars.get(index);

            System.out.println("Enter year of sale: ");
            int year = scanner.nextInt();

            System.out.println("Enter mileage on sale: ");
            int mileage = scanner.nextInt();

            System.out.println("Enter power on sale: ");
            int power = scanner.nextInt();

            double salePrice = carToSell.sell(year, mileage, power);
            cars.remove(index); // Remove car from list after selling
            dealerMoney += salePrice; // Add the sale price to dealer's money
            System.out.println("Car sold for " + salePrice + ". Dealer's new balance: " + dealerMoney);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Dealer Menu
    public void dealerMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Dealer Menu ---");
            System.out.println("1. Show all cars");
            System.out.println("2. Add car");
            System.out.println("3. Sell car");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllCars();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    sellCar();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Exiting Dealer Menu.");
    }
}
