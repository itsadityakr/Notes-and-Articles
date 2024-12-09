public class J7_BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int x = 5; // Binary: 0000 0101
        int y = 3; // Binary: 0000 0011

        // AND Operator (&)
        int andResult = x & y; // Binary: 0000 0001 (Decimal: 1)
        System.out.println("AND (&) Operation: " + andResult);

        // OR Operator (|)
        int orResult = x | y; // Binary: 0000 0111 (Decimal: 7)
        System.out.println("OR (|) Operation: " + orResult);

        // XOR Operator (^)
        int xorResult = x ^ y; // Binary: 0000 0110 (Decimal: 6)
        System.out.println("XOR (^) Operation: " + xorResult);

        // Left Shift Operator (<<)
        int leftShiftResult = x << 1; // Binary: 0000 1010 (Decimal: 10)
        System.out.println("Left Shift (<<) Operation: " + leftShiftResult);

        // Right Shift Operator (>>)
        int rightShiftResult = x >> 1; // Binary: 0000 0010 (Decimal: 2)
        System.out.println("Right Shift (>>) Operation: " + rightShiftResult);

        // Bitwise NOT Operator (~)
        int notResult = ~x; // Binary: 1111 1010 (Decimal: -6 in two's complement)
        System.out.println("NOT (~) Operation: " + notResult);

        // Explanation of binary representation for better understanding
        System.out.println("Binary representation of x (5): " + Integer.toBinaryString(x));
        System.out.println("Binary representation of y (3): " + Integer.toBinaryString(y));
        System.out.println("Binary representation of ~x (-6): " + Integer.toBinaryString(notResult));
    }
}
