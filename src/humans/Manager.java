package humans;

// Extending humans.Person class to create humans.Manager class
public class Manager extends Person {
    // Fields for humans.Manager class
    private int managerID;
    private int actionNumber;

    // Constructor
    public Manager(String name, int age, String username, String password) {
        // Call the constructor of the humans.Person class
        super(name, age, username, password);
        // Generate unique managerID and set actionNumber to 0
        this.managerID = 1 + (int)(Math.random() * ((1000000 - 1) + 1)); // Auto-generate managerID
        this.actionNumber = 0; // Set actionNumber to 0 in constructor
    }

    // Getter for actionNumber
    public int getActionNumber() {
        return actionNumber;
    }

    // Setter for actionNumber
    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    // Getter for managerID
    public int getManagerID() {
        return managerID;
    }

    // Method to update money in customer's account
    public void updateMoney(Customer customer, double changeAmount) {
        // Get previous balance and update it
        double newBalance = customer.getBalance() + changeAmount;
        customer.setBalance(newBalance);
        System.out.println("Updated " + customer.getName() + "'s balance to: " + customer.getBalance());
    }

    // Override toString method to include managerID
    @Override
    public String toString() {
        return super.toString() + ", Manager Id: " + managerID;
    }

    @Override
    public boolean equals(Object obj){
        boolean retVal = false;
        try{
            Manager managerToCompare = (Manager) obj;

            if (super.equals(managerToCompare)
                    || ((this.managerID == managerToCompare.managerID) && this.getPassword().equals(managerToCompare.getPassword())))
                retVal = true;

        }
        catch (Exception e){}

        return retVal;
    }

}
