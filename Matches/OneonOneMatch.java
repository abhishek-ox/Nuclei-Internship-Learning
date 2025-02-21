package Matches;

import java.util.Random;

import Wrestlers.Wrestler;

public class OneonOneMatch extends Match {

    public OneonOneMatch(Wrestler w1, Wrestler w2) {
        this.wrestler1 = w1;
        this.wrestler2 = w2;
    }

    public void startMatch() {
        System.out.println("Welcome to the Ultimate One on One between 2 Champions");

        Random random = new Random();
        while (!wrestler1.isEliminated() && !wrestler2.isEliminated()) {
            int turn = random.nextInt(2) + 1;
            if (turn == 1) {

                wrestler1.performMove(wrestler2);
                if (wrestler2.isEliminated()) {
                    waitForSeconds(2);
                    System.out.println(wrestler1.getName() + " is your winner!!");
                    break;
                }
            } else {
                wrestler2.performMove(wrestler1);
                if (wrestler1.isEliminated()) {
                    waitForSeconds(2);
                    System.out.println(wrestler2.getName() + " is your winner!!");
                    break;
                }
            }
        }
    }

    private void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000); // Convert seconds to milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
