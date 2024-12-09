import java.util.Scanner;

public class J8_ControlFlowDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. If-Else Example
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative or zero.");
        }

        // 2. Else-If Example
        System.out.println("\nEnter another number:");
        number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // 3. Nested If-Else Example
        System.out.println("\nEnter your age:");
        int age = scanner.nextInt();

        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You are an adult and eligible to drink alcohol.");
            } else {
                System.out.println("You are an adult but not eligible to drink alcohol.");
            }
        } else {
            System.out.println("You are a minor.");
        }

        // 4. Switch Example
        System.out.println("\nEnter a number (1 to 7) to get the corresponding day:");
        int day = scanner.nextInt();
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("Day: " + dayName);

        // 5. Combined Example
        System.out.println("\nEnter your age again for a detailed check:");
        age = scanner.nextInt();
        String eligibility;

        if (age >= 18) {
            if (age >= 21) {
                eligibility = "You are eligible to vote, drink, and drive!";
            } else if (age >= 19) {
                eligibility = "You are eligible to vote and drink!";
            } else {
                eligibility = "You are eligible to vote!";
            }
        } else {
            eligibility = "You are not eligible for voting or drinking.";
        }

        System.out.println(eligibility);
    }
}
