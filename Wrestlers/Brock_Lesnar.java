package Wrestlers;

public class Brock_Lesnar extends Wrestler {
    public Brock_Lesnar() {
        super("Brock Lesnar", 35, true, 200);
    }

    public void specialMove(Wrestler opponent) {
        if (this.gethealth() > 10) {
            opponent.setHealth(opponent.gethealth() - this.getpower());
            System.out.println(this.getName() + " performed a special move on " + opponent.getName());
        } else {
            System.out.println(this.getName() + " is too weak to attack.");
        }
    }

    public void taunt() {
        System.out.println("Hope you brought a pillow, cause you're about to take a long nap!");
    }
}
