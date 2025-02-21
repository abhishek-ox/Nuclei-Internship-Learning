package Wrestlers;

// made use of encapsulation here
public abstract class Wrestler {
    private String name;
    private int power;
    private boolean status;
    private int health;

    public Wrestler(String name, int power, boolean status, int health) {
        this.name = name;
        this.power = power;
        this.status = status;
        this.health = health;
    }

    // getters to encapsulate
    public String getName() {
        return name;
    }

    public int getpower() {
        return power;
    }

    public boolean getstatus() {
        return status;
    }

    public int gethealth() {
        return health;
    }

    // setters to change them

    public void setname(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void performMove(Wrestler opponent) {
        if (this.health > 10) {
            int damage = Math.max(5, this.power - 5);
            opponent.setHealth(opponent.gethealth() - damage);
            waitForSeconds(1);
            System.out.println(
                    this.name + " performed an attack on " + opponent.name + " dealing " + damage + " damage.");
        } else {
            waitForSeconds(1);
            System.out.println(this.name + " is too weak to attack.");
        }
    }

    public boolean isEliminated() {
        if (this.health <= 0) {
            this.status = false;
            System.out.println(this.name + " is Eliminated.");
            return true;
        }
        return false;
    }

    public abstract void specialMove(Wrestler opponent);

    public abstract void taunt();

    private void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
