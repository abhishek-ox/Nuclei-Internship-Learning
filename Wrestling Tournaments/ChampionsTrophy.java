package Matches;

import Wrestlers.Wrestler;
import java.util.Random;

public class ChampionsTrophy extends Match {

    public ChampionsTrophy(Wrestler w1, Wrestler w2, Wrestler w3, Wrestler w4) {
        this.wrestler1 = w1;
        this.wrestler2 = w2;
        this.wrestler3 = w3;
        this.wrestler4 = w4;
    }

    private void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void startMatch() {
        Random random = new Random();

        System.out.println("\nMatch 1: " + wrestler1.getName() + " vs " + wrestler2.getName());
        while (wrestler1.gethealth() > 100 && wrestler2.gethealth() > 100) {
            int damage = random.nextInt(16) + 10;
            if (random.nextBoolean()) {
                wrestler1.setHealth(wrestler1.gethealth() - damage);
                System.out.println(
                        wrestler1.getName() + " takes " + damage + " damage! Health: " + wrestler1.gethealth());
            } else {
                wrestler2.setHealth(wrestler2.gethealth() - damage);
                System.out.println(
                        wrestler2.getName() + " takes " + damage + " damage! Health: " + wrestler2.gethealth());
            }
            delay();
        }
        Wrestler winner1 = (wrestler1.gethealth() <= 100) ? wrestler2 : wrestler1;
        System.out.println(" Winner: " + winner1.getName() + "\n");

        System.out.println("Match 2: " + wrestler3.getName() + " vs " + wrestler4.getName());
        while (wrestler3.gethealth() > 100 && wrestler4.gethealth() > 100) {
            int damage = random.nextInt(16) + 10;
            if (random.nextBoolean()) {
                wrestler3.setHealth(wrestler3.gethealth() - damage);
                System.out.println(
                        wrestler3.getName() + " takes " + damage + " damage! Health: " + wrestler3.gethealth());
            } else {
                wrestler4.setHealth(wrestler4.gethealth() - damage);
                System.out.println(
                        wrestler4.getName() + " takes " + damage + " damage! Health: " + wrestler4.gethealth());
            }
            delay();
        }
        Wrestler winner2 = (wrestler3.gethealth() <= 100) ? wrestler4 : wrestler3;
        System.out.println(" Winner: " + winner2.getName() + "\n");

        System.out.println(" Final Match: " + winner1.getName() + " vs " + winner2.getName());
        while (winner1.gethealth() > 0 && winner2.gethealth() > 0) {
            int damage = random.nextInt(16) + 10;
            if (random.nextBoolean()) {
                winner1.setHealth(winner1.gethealth() - damage);
                System.out.println(winner1.getName() + " takes " + damage + " damage! Health: " + winner1.gethealth());
            } else {
                winner2.setHealth(winner2.gethealth() - damage);
                System.out.println(winner2.getName() + " takes " + damage + " damage! Health: " + winner2.gethealth());
            }
            delay();
        }
        Wrestler finalWinner = (winner1.gethealth() <= 0) ? winner2 : winner1;
        System.out.println("\n " + finalWinner.getName() + " is the CHAMPION of the tournament!");
    }
}
