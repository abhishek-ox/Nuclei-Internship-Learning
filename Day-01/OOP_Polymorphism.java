class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makeSound();
    }
}

// Polymorphism
// 🔹 What is it?
// Polymorphism means "many forms" and allows a method to behave differently based on the object that calls it.

// 🔹 Why do we use it?
// ✔ To write flexible & scalable code.
// ✔ To allow one method to work for multiple types.
// ✔ To achieve method overloading & overriding.

// 🔹 When do we use it?
// ✔ When the same operation needs to work differently for different classes.
// ✔ When implementing overloading (same method, different parameters).
// ✔ When using overriding (same method in parent & child class).

// 🔹 Where do we use it?
// ✔ In UI frameworks (e.g., draw() method for Circle, Rectangle).
// ✔ In method overloading (e.g., multiple ways to calculate area).
// ✔ In overriding for dynamic method dispatch.

// 🔹 Advantages of using it?
// ✔ Improves code flexibility & readability.
// ✔ Enhances maintainability by allowing behavior modification.

// 🔹 Disadvantages of using it?
// ❌ Can increase debugging complexity due to dynamic method calls.
// ❌ Improper implementation may lead to unexpected behavior.

// 🔹 Common mistakes people do while using it?
// 🚨 Confusing method overloading with method overriding.
// 🚨 Forgetting to use @Override annotation when overriding methods.
