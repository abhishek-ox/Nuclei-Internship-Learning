abstract class Animal {
    abstract void makeSound();
    
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();
    }
}


// Abstraction
// 🔹 What is it?
// Abstraction hides implementation details and only shows the essential features.

// 🔹 Why do we use it?
// ✔ To simplify complex systems.
// ✔ To allow only necessary interactions.
// ✔ To improve security & maintainability.

// 🔹 When do we use it?
// ✔ When defining common behavior without exposing implementation :
//         Example:
//         => A Bank Account class provides deposit() and withdraw() methods, but users don't need to know the internal banking system.
//         => A Car class has a startEngine() method, but the user doesn't need to know how the engine works internally.

// ✔ When designing frameworks/APIs.

//         Example:
//         => Java's List interface lets you use ArrayList, LinkedList, etc., without knowing their internal implementation.
//         => A Payment System API may provide a processPayment() method, but the internal transaction handling is hidden.

// 🔹 Where do we use it?
// ✔ ATM machines (users don’t see how transactions are processed).
// ✔ In abstract classes & interfaces.

// 🔹 Advantages of using it?
// ✔ Reduces code complexity.
// ✔ Improves security by hiding implementation.

// 🔹 Disadvantages of using it?
// ❌ Increases initial development effort.
// ❌ Can limit flexibility if too restrictive.

// 🔹 Common mistakes people do while using it?
// 🚨 Mixing abstraction with encapsulation.
// 🚨 Forgetting to implement all methods from an interface.

