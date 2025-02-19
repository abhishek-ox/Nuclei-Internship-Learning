class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person("John");
        System.out.println(p.getName()); 

        p.setName("Alice");
        System.out.println(p.getName());
    }
}

// Encapsulation
// 🔹 What is it?
// Encapsulation is the practice of hiding data and restricting direct access to class members by using private variables and providing public getter & setter methods.

// 🔹 Why do we use it?
// ✔ To protect data from accidental modification.
// ✔ To control access to class members.
// ✔ To achieve data hiding and security.

// 🔹 When do we use it?
// ✔ When we want to restrict direct modification of variables.
// ✔ When we need to define rules for accessing data.

// 🔹 Where do we use it?
// ✔ Banking applications (e.g., private account balance with controlled deposit/withdrawal).
// ✔ Medical records (restrict access to patient data).
// ✔ Any application that requires data security and controlled access.

// 🔹 Advantages of using it?
// ✔ Increases security by preventing unauthorized changes.
// ✔ Provides control over data through getter/setter methods.
// ✔ Makes code modular & maintainable.

// 🔹 Disadvantages of using it?
// ❌ Slightly increases code complexity (extra methods for access).
// ❌ Can cause performance overhead if excessive getters/setters are used.

// 🔹 Common mistakes people do while using it?
// 🚨 Forgetting to use getters/setters and accessing private fields directly.
// 🚨 Making unnecessary getter/setter methods for variables that don’t need access control.
