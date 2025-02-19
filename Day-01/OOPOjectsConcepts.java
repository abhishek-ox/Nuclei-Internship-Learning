class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining Balance: " + balance);
        }
    }

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 5000);
        BankAccount account2 = new BankAccount("Bob", 3000);

        account1.displayAccount();
        account1.deposit(2000);
        account1.withdraw(1000);

        account2.displayAccount();
        account2.withdraw(4000);
    }
}

// 1️⃣ WHAT is an Object?
// An object is an instance of a class. It is a real-world entity that has:
// ✔ State (Properties/Fields) → e.g., brand = "Tesla", speed = 200.
// ✔ Behavior (Methods/Functions) → e.g., drive(), brake().

// Think of a class as a blueprint and an object as the actual house built from it.

// 2️⃣ WHY is it used?
// We use objects because they allow us to:
// ✔ Store real-world data → e.g., a Student object stores name, age, roll number.
// ✔ Use class methods → e.g., a Car object can call startEngine().
// ✔ Implement Object-Oriented Programming (OOP) → Objects enable encapsulation, inheritance, and polymorphism, making code more structured.

// Without objects, we’d have to use separate variables for every piece of data, leading to messy and unorganized code.

// 3️⃣ WHEN it is used?
// ✔ Store and manage data efficiently → Example: A Student object stores name, age, and roll number instead of using separate variables.

// ✔ Reuse a structure multiple times → Example: Instead of writing separate code for different cars, we create a Car class and use objects for Tesla, BMW, etc.

// ✔ Call methods associated with a class → Example: A BankAccount object can call deposit() and withdraw() methods.

// ✔ Follow Object-Oriented Programming (OOP) principles → Objects allow us to implement encapsulation, inheritance, and polymorphism, making the code structured and scalable.

// 4️⃣WHERE is it used?
// Objects are used everywhere in Java applications, including:
// ✔ Web & Mobile Apps → User objects (User, Account).
// ✔ Gaming → Character objects (Player, Enemy).
// ✔ Banking Applications → Account objects (Account, Transaction).
// ✔ GUI Applications → Button objects (Button, TextField).

// 💡 Example:
// In a banking app, every customer has an Account object storing their details (balance, accountNumber, etc.).

// 5️⃣ADVANTAGES of using objects?
// ✔ Encapsulation → Keeps data secure inside an object.
// ✔ Code Reusability → Once a class is defined, we can create multiple objects.
// ✔ Modularity → Objects make programs manageable and structured.
// ✔ Scalability → Large applications become easier to maintain.

// 6️⃣DISADVANTAGES of using objects?
// ❌ Memory Consumption → Each object takes up memory, which can slow down large applications.
// ❌ Garbage Collection Overhead → Objects stay in memory until Java’s garbage collector removes them, which can affect performance.
// ❌ Overcomplication → Using objects unnecessarily for small tasks can make code complex and harder to debug.

// 7️⃣ COMMON MISTAKES people do while using objects?
// 🚨 Forgetting to initialize an object → Leads to NullPointerException.
// Car car1; // Object reference created, but no memory allocated!
// car1.display(); // ERROR: NullPointerException
// 🚨 Using non-static members inside a static context →
// class Example {
//     int num = 10;

//     public static void main(String[] args) {
//         System.out.println(num); // ERROR: Cannot use non-static variable in a static method
//     }
// }
// 🚨 Modifying object properties incorrectly →
// Car car1 = new Car("Tesla", 200);
// car1.brand = "BMW"; // Works, but directly modifying fields is bad practice
