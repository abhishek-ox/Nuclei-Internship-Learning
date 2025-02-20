abstract class C {
    String name;
    int modelNo;

    abstract void model();

    public void version() {
        System.out.println("its old version");
    }
}

class Vehicle extends C {
    public void model() {
        System.out.println("This is 2nd model");
    }
}

public class Car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        v.model();
        v.version();
    }
}
