package humans;

public class Main {
    // Main method to test the functionality
    public static void main(String[] args) {
        // Create manager objects
        Manager manager1 = new Manager("Simba", 45, "simbaManager", "securePass123");

        // Create customer objects
        Customer customer1 = new Customer("John", 30, "johnDoe", "password123", 500.0);

        // Testing updateMoney method
        manager1.updateMoney(customer1, 200.0);   // Increase money
        manager1.updateMoney(customer1, -150.0);  // Decrease money

        // Testing toString method
        System.out.println(manager1); // Output: Name: Simba, Age: 45, ManagerID: <random-UUID>

        // Testing equals method
        Manager manager2 = new Manager("Cleopatra", 50, "cleopatraManager", "securePass321");
        System.out.println(manager1.equals(manager2)); // Output: false

        // Update action number
        manager1.setActionNumber(10);
        System.out.println("Action Number of " + manager1.getName() + ": " + manager1.getActionNumber()); // Output: 10
    }
}
