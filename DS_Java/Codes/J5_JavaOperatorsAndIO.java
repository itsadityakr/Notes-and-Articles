import java.util.Scanner;

public class J5_JavaOperatorsAndIO {

    public static void main(String[] args) {
        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        int addition = 5 + 3; // Addition
        int subtraction = 5 - 3; // Subtraction
        int multiplication = 5 * 3; // Multiplication
        int division = 10 / 3; // Integer Division
        int modulus = 10 % 3; // Modulus
        System.out.println("Addition: " + addition); // 8
        System.out.println("Subtraction: " + subtraction); // 2
        System.out.println("Multiplication: " + multiplication); // 15
        System.out.println("Division: " + division); // 3
        System.out.println("Modulus: " + modulus); // 1

        // Relational Operators
        System.out.println("\nRelational Operators:");
        boolean isEqual = (5 == 5); // true
        boolean isNotEqual = (5 != 3); // true
        boolean isGreater = (5 > 3); // true
        boolean isLess = (3 < 5); // true
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);

        // Logical Operators
        System.out.println("\nLogical Operators:");
        boolean andOperator = (5 > 3) && (3 > 1); // true
        boolean orOperator = (5 > 3) || (3 < 1); // true
        boolean notOperator = !(5 > 3); // false
        System.out.println("AND Operator: " + andOperator);
        System.out.println("OR Operator: " + orOperator);
        System.out.println("NOT Operator: " + notOperator);

        // Unary Operators
        System.out.println("\nUnary Operators:");
        int x = 5;
        System.out.println("Original x: " + x);
        System.out.println("Pre-increment: " + (++x)); // 6
        System.out.println("Post-increment: " + (x++)); // 6 (then x becomes 7)
        System.out.println("Post-decrement: " + (x--)); // 7 (then x becomes 6)
        System.out.println("Pre-decrement: " + (--x)); // 5

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int y = 5;
        y += 3; // y = y + 3
        System.out.println("Addition Assignment: " + y); // 8
        y -= 2; // y = y - 2
        System.out.println("Subtraction Assignment: " + y); // 6
        y *= 2; // y = y * 2
        System.out.println("Multiplication Assignment: " + y); // 12
        y /= 3; // y = y / 3
        System.out.println("Division Assignment: " + y); // 4

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int bitwiseAnd = 5 & 3; // 1
        int bitwiseOr = 5 | 3; // 7
        int bitwiseXor = 5 ^ 3; // 6
        int leftShift = 5 << 1; // 10
        int rightShift = 5 >> 1; // 2
        int bitwiseNot = ~5; // -6
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        System.out.println("Bitwise NOT: " + bitwiseNot);

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Eligibility: " + eligibility);

        // Input and Output
        System.out.println("\nInput and Output:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Input from user
        System.out.println("Hello, " + name + "!"); // Output to user
    }
}
