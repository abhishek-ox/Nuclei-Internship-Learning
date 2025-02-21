package Wrestlers;

public class Rudra extends Wrestler {
    public Rudra() {
        super("Rudra", 40, true, 200);
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
        System.out.println("Blink twice if you need me to go easy on you!");
    }
}
