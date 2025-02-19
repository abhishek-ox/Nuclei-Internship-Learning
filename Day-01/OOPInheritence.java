class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); 
        myDog.bark();
    }
}

// Inheritance
// 🔹 What is it?
// Inheritance allows a class (child) to reuse properties & methods from another class (parent) to avoid code duplication.

// 🔹 Why do we use it?
// ✔ To reduce redundancy by reusing existing code.
// ✔ To establish a hierarchical relationship between classes.
// ✔ To improve code maintainability.

// 🔹 When do we use it?
// ✔ When multiple classes share common attributes & behaviors.
// ✔ When extending a general class into more specialized versions.

// 🔹 Where do we use it?
// ✔ In game development (e.g., a Vehicle class inherited by Car, Bike).
// ✔ In enterprise software (e.g., Employee → Manager, Developer).
// ✔ In frameworks/libraries to extend existing classes.

// 🔹 Advantages of using it?
// ✔ Code reusability – No need to rewrite the same code.
// ✔ Improves readability and maintainability.
// ✔ Establishes a clear hierarchy between classes.

// 🔹 Disadvantages of using it?
// ❌ Tightly couples parent & child classes, making modifications difficult.
// ❌ Increases complexity if overused.

// 🔹 Common mistakes people do while using it?
// 🚨 Overusing inheritance where composition (object reuse) would be better.
// 🚨 Forgetting to use super() to call the parent constructor.
