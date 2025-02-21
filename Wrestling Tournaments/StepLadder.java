package Matches;

import java.util.Random;
import Wrestlers.Wrestler;

public class StepLadder extends Match {
    private int stepsW1 = 0;
    private int stepsW2 = 0;
    private final int winning_steps = 20;

    public StepLadder(Wrestler w1, Wrestler w2) {
        this.wrestler1 = w1;
        this.wrestler2 = w2;
    }

    public void startMatch() {
        System.out.println("Welcome to the Step Ladder Match!");

        Random random = new Random();
        boolean turn = true; // true -> wrestler1's turn, false -> wrestler2's turn

        while (stepsW1 < winning_steps && stepsW2 < winning_steps) {
            int stepsClimbed = random.nextInt(6) + 1; // Random steps between 1-6

            if (turn) {
                stepsW1 += stepsClimbed;
                System.out
                        .println(wrestler1.getName() + " climbed " + stepsClimbed + " steps. (Total: " + stepsW1 + ")");
            } else {
                stepsW2 += stepsClimbed;
                System.out
                        .println(wrestler2.getName() + " climbed " + stepsClimbed + " steps. (Total: " + stepsW2 + ")");
            }

            waitForSeconds(2); // 2-second delay for readability
            turn = !turn; // Switch turns
        }

        // Announce the winner
        if (stepsW1 >= winning_steps) {
            System.out.println(wrestler1.getName() + " reached the top! Winner of the Step Ladder Match!");
        } else {
            System.out.println(wrestler2.getName() + " reached the top! Winner of the Step Ladder Match!");
        }
    }

    private void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
