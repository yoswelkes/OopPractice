package phones;

public class PhoneTester {
    public static void main(String[] args) {
        // Create an instance of YosiefPhone
        YosiefPhone myPhone = new YosiefPhone();

        // Simulate a few calls and texts
        myPhone.call();
        myPhone.text();
        myPhone.call();
        myPhone.text();

        // Show call and text history
        myPhone.showCallHistory();
        myPhone.showTextHistory();
    }
}
