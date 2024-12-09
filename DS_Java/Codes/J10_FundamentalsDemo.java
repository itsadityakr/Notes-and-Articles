// Demonstrating Java Fundamentals
class J10_FundamentalsDemo {

    // 1. Methods
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Method Overloading
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public void display(int number) {
        System.out.println("Number: " + number);
    }

    // 3. Method Overriding
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    // 4. Constructors
    static class Car {
        private String model;
        private int year;

        // Constructor
        public Car(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public void displayDetails() {
            System.out.println("Car Model: " + model + ", Year: " + year);
        }
    }

    // 5. Access Modifiers
    static class Person {
        public String name;  // Public
        private int age;     // Private
        protected String address; // Protected

        // Setter for private field
        public void setAge(int age) {
            this.age = age;
        }

        // Getter for private field
        public int getAge() {
            return age;
        }
    }

    // 6. `this` Keyword
    static class Student {
        private String name;
        private int grade;

        // Constructor with parameters
        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        // Using `this` to call another constructor
        public Student(String name) {
            this(name, 10); // Default grade is 10
        }

        public void displayInfo() {
            System.out.println("Student Name: " + name + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        // 1. Methods
        J10_FundamentalsDemo demo = new J10_FundamentalsDemo();
        System.out.println("Sum: " + demo.add(5, 7)); // Output: 12

        // 2. Method Overloading
        demo.display("Hello, Java!"); // Output: Message: Hello, Java!
        demo.display(42);            // Output: Number: 42

        // 3. Method Overriding
        Animal genericAnimal = new Animal();
        Dog specificDog = new Dog();
        genericAnimal.sound(); // Output: Animal makes a sound
        specificDog.sound();   // Output: Dog barks

        // 4. Constructors
        Car car = new Car("Tesla Model S", 2023);
        car.displayDetails(); // Output: Car Model: Tesla Model S, Year: 2023

        // 5. Access Modifiers
        Person person = new Person();
        person.name = "Alice";   // Public field
        person.setAge(30);       // Private field set via setter
        person.address = "123 Java Street"; // Protected field
        System.out.println("Name: " + person.name);        // Output: Name: Alice
        System.out.println("Age: " + person.getAge());     // Output: Age: 30
        System.out.println("Address: " + person.address);  // Output: Address: 123 Java Street

        // 6. `this` Keyword
        Student student1 = new Student("John", 12);
        Student student2 = new Student("Jane"); // Uses constructor chaining
        student1.displayInfo(); // Output: Student Name: John, Grade: 12
        student2.displayInfo(); // Output: Student Name: Jane, Grade: 10
    }
}
