package Wrestlers;

public class Dean_Ambrose extends Wrestler {
    public Dean_Ambrose() {
        super("Dean Ambrose", 15, true, 200);
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
        System.out.println("You fight like my grandma… and she hits harder than you!");
    }
}
