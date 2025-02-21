package Wrestlers;

public class Roman_Reigns extends Wrestler {

    public Roman_Reigns() {
        super("Roman Reigns", 25, true, 200);
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
        System.out.println("Haha !! Too Weak to even look into my face huh ?");
    }
}
