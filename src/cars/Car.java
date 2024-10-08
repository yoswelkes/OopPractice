package cars;

public interface Car {
    void run();
    void stop();
    void repair();
    double sell(int year, int mileage, int power);  // Added sell method
}
