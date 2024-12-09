public class J3_JavaDataTypes {

    public static void main(String[] args) {
        // Primitive Data Types
        System.out.println("Primitive Data Types:");

        // byte (8-bit integer)
        byte b = 100;
        System.out.println("byte: " + b); // Output: 100

        // short (16-bit integer)
        short s = 5000;
        System.out.println("short: " + s); // Output: 5000

        // int (32-bit integer)
        int i = 100000;
        System.out.println("int: " + i); // Output: 100000

        // long (64-bit integer)
        long l = 10000000000L;
        System.out.println("long: " + l); // Output: 10000000000

        // float (32-bit floating-point number)
        float f = 3.14f;
        System.out.println("float: " + f); // Output: 3.14

        // double (64-bit floating-point number)
        double d = 3.14159;
        System.out.println("double: " + d); // Output: 3.14159

        // char (16-bit Unicode character)
        char c = 'A';
        System.out.println("char: " + c); // Output: A

        // boolean (true or false)
        boolean isJavaFun = true;
        System.out.println("boolean: " + isJavaFun); // Output: true

        System.out.println("\nReference Data Types:");

        // String (Sequence of characters)
        String str = "Hello, Java!";
        System.out.println("String: " + str); // Output: Hello, Java!

        // Array (A collection of elements of the same type)
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array first element: " + numbers[0]); // Output: 1

        // Object (Instances of a class)
        class Person {
            String name;
            int age;

            Person(String pname, int page) {
                this.name = pname;
                this.age = page;
            }
        }

        Person person1 = new Person("Alice", 30);
        System.out.println("Object: " + person1.name + " is " + person1.age + " years old.");
        // Output: Alice is 30 years old.

        // Null (Represents no object reference)
        String name = null;
        System.out.println("Null: " + name); // Output: null
    }
}
