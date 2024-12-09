public class J4_JavaBasics {

    public static void main(String[] args) {
        // Literals
        System.out.println("Literals:");

        // Integer Literals
        int decimalLiteral = 10; // Decimal literal
        int hexLiteral = 0xA; // Hexadecimal literal
        System.out.println("Integer Literals: Decimal - " + decimalLiteral + ", Hexadecimal - " + hexLiteral);

        // Floating-Point Literals
        double pi = 3.14; // Double literal
        float temperature = 36.6f; // Float literal
        System.out.println("Floating-Point Literals: Double - " + pi + ", Float - " + temperature);

        // Boolean Literals
        boolean isJavaFun = true; // Boolean literal
        System.out.println("Boolean Literal: " + isJavaFun);

        // Character Literals
        char grade = 'A'; // Character literal
        System.out.println("Character Literal: " + grade);

        // String Literals
        String greeting = "Hello, World!"; // String literal
        System.out.println("String Literal: " + greeting);

        // Type Conversion
        System.out.println("\nType Conversion:");

        // Implicit Type Conversion
        int intVal = 5;
        double doubleVal = intVal; // Implicit conversion from int to double
        System.out.println("Implicit Type Conversion: int to double - " + doubleVal);

        // Explicit Type Conversion (Casting)
        double originalDouble = 5.75;
        int castedInt = (int) originalDouble; // Explicit conversion from double to int
        System.out.println("Explicit Type Conversion: double to int - " + castedInt);

        // Constants
        System.out.println("\nConstants:");

        // Declaring a constant
        final int MAX_SPEED = 120; // Constant
        System.out.println("Constant MAX_SPEED: " + MAX_SPEED);

        // Uncommenting the following line will cause a compilation error:
        // MAX_SPEED = 150; // Error: cannot assign a value to final variable MAX_SPEED
    }
}
