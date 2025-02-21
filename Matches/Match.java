package Matches;

import Wrestlers.*;

public abstract class Match {
    protected Wrestler wrestler1;
    protected Wrestler wrestler2;
    protected Wrestler wrestler3;
    protected Wrestler wrestler4;

    public abstract void startMatch();

    public void checkElimination(Wrestler wrestler) {
        if (wrestler.isEliminated()) {
            System.out.println(wrestler.getName() + " has been Eliminated ");
        }
    }
}
