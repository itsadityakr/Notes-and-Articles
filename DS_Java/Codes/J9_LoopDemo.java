public class J9_LoopDemo {
    public static void main(String[] args) {
        // 1. For Loop Example
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        // 2. While Loop Example
        System.out.println("\nWhile Loop:");
        int i = 0; // Initialize counter
        while (i < 5) {
            System.out.println("The value of i is: " + i);
            i++; // Increment the counter
        }

        // 3. Do-While Loop Example
        System.out.println("\nDo-While Loop:");
        i = 0; // Reset counter
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (i < 5);

        // 4. For-Each Loop Example
        System.out.println("\nFor-Each Loop:");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 5. Break Statement Example
        System.out.println("\nFor Loop with Break:");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                break; // Exit the loop when j equals 5
            }
            System.out.println("The value of j is: " + j);
        }

        // 6. Continue Statement Example
        System.out.println("\nFor Loop with Continue:");
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                continue; // Skip the iteration when j equals 2
            }
            System.out.println("The value of j is: " + j);
        }
    }
}
