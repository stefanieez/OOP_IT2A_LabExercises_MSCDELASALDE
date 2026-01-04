import java.util.ArrayList;     // for dynamic lists
import java.util.Scanner;       // for user input
import java.util.Collections;   // for sorting
import java.time.LocalTime;     // for time handling
import java.lang.Math;          // for math operations

public class BuiltInSample {
    public static void main(String[] args) {

        // 1. Scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // 2. ArrayList to store items
        ArrayList<String> items = new ArrayList<>();
        items.add("Milk");
        items.add("Eggs");
        items.add("Bread");

        // 3. Collections to sort items
        Collections.sort(items);

        // 4. LocalTime to get current time
        LocalTime timeNow = LocalTime.now();

        // 5. Math for calculation
        double originalPrice = 120.50;
        double tax = Math.round(originalPrice * 0.12); // 12% tax

        // Output
        System.out.println("\nUser age: " + age);
        System.out.println("Current time: " + timeNow);
        System.out.println("Grocery items (sorted): " + items);
        System.out.println("Tax amount: ₱" + tax);

        input.close();
    }
}
