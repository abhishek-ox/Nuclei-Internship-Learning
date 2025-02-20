abstract class Keeping_Warm {
    String food;
    String water;

    public abstract void warm();
}

class Tent2 extends Keeping_Warm {
    public void warm() {
        System.out.println("The tent is keeping me safe");
    }
}

public class Tent {
    public static void main(String[] args) {
        Tent2 t = new Tent2();
        t.warm();
    }
}
