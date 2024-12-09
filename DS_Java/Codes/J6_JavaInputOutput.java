import java.util.Scanner;

public class J6_JavaInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Formatted Output
        System.out.println("Formatted Output:");
        int age = 25;
        double price = 10.50;
        String name = "Alice";
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d years\n", age);
        System.out.printf("Price: %.2f dollars\n", price);

        // 2. String Input
        System.out.println("\nString Input:");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        // 3. Integer Input
        System.out.println("\nInteger Input:");
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();
        System.out.println("You are " + userAge + " years old.");

        // 4. Character Input
        System.out.println("\nCharacter Input:");
        System.out.print("Enter a character: ");
        char userChar = scanner.next().charAt(0);
        System.out.println("You entered: " + userChar);

        // 5. Multiline Input
        System.out.println("\nMultiline Input:");
        System.out.println("Enter multiple lines of text (type 'STOP' to end):");
        scanner.nextLine(); // Consume the leftover newline
        String line;
        while (!(line = scanner.nextLine()).equals("STOP")) {
            System.out.println("You entered: " + line);
        }

        // 6. Input Validation
        System.out.println("\nInput Validation:");
        int validNumber;
        while (true) {
            System.out.print("Enter a valid integer: ");
            if (scanner.hasNextInt()) {
                validNumber = scanner.nextInt();
                break; // Exit loop on valid input
            } else {
                System.out.println("That's not a valid integer! Please try again.");
                scanner.next(); // Clear invalid input
            }
        }
        System.out.println("You entered the number: " + validNumber);
    }
}
