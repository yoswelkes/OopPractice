package phones;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class SimplePhone implements Phone {
    // Fields to store call and text history
    protected ArrayList<String> callHistory = new ArrayList<>();
    protected ArrayList<String> textHistory = new ArrayList<>();

    @Override
    public void call() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name or number you want to call: ");
        String person = scanner.nextLine();
        callHistory.add(person);
        System.out.println("Calling " + person + "...");
    }

    @Override
    public void text() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name or number you want to text: ");
        String person = scanner.nextLine();
        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        textHistory.add("To: " + person + ", Message: " + message);
        System.out.println("Text sent to " + person + ": " + message);
    }

    @Override
    public void showCallHistory() {
        System.out.println("Call History:");
        for (String call : callHistory) {
            System.out.println(call);
        }
    }

    @Override
    public void showTextHistory() {
        System.out.println("Text History:");
        for (String text : textHistory) {
            System.out.println(text);
        }
    }
}
