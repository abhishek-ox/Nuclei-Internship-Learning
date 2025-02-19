class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Tesla", 200);
        Car car2 = new Car("BMW", 180);

        car1.displayInfo();
        car2.displayInfo();
    }
}


// CLASS

// 1️⃣ Why do we use it?
// A class helps structure a program by grouping data (fields/variables) and behavior (methods/functions) in one place. This makes the code organized, reusable, and easy to manage.

// 2️⃣ When do we use it?
// We use a class when multiple objects share similar properties and behaviors. For example, in a banking app, an Account class can be used for different customers, each with a balance, account number, and methods for transactions.

// 3️⃣ Where do we use it?
// In any Java program that follows Object-Oriented Programming (OOP).
// Used in software development for web apps, mobile apps, games, and enterprise systems.
// Example: Android development uses Java classes for UI components (Activity, Fragment).

// 4️⃣ Advantages of using it?
// ✔ Encapsulation – Hides data and provides controlled access.
// ✔ Code reusability – Define a class once, use it multiple times.
// ✔ Maintainability – Makes debugging and updates easier.
// ✔ Scalability – Helps manage large projects efficiently.

// 5️⃣ Disadvantages of using it?
// ❌ Memory overhead – Objects take up more memory than simple data structures.
// ❌ Complexity – Overusing classes can make code unnecessarily complicated.
// ❌ Performance – More abstraction can lead to slower execution in some cases.

// 6️⃣ Common mistakes people make?
// 🚨 Not initializing objects properly → Leads to NullPointerException.
// 🚨 Using non-static members in a static context → this can't be used inside a static method.
// 🚨 Poor naming conventions → Using lowercase class names (student instead of Student).
// 🚨 Overusing classes → Making everything a class when simpler solutions exist (e.g., utility methods).
