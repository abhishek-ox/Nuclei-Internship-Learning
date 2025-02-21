import Matches.OneonOneMatch;
import Matches.StepLadder;
import Wrestlers.Brock_Lesnar;
import Wrestlers.Dean_Ambrose;
import Wrestlers.Roman_Reigns;
import Wrestlers.Rudra;
import Matches.ChampionsTrophy;

public class Main {
    public static void main(String[] args) {
        Brock_Lesnar brock = new Brock_Lesnar();
        Roman_Reigns roman = new Roman_Reigns();
        Dean_Ambrose dean = new Dean_Ambrose();
        Rudra rudra = new Rudra();

        OneonOneMatch One_on_One = new OneonOneMatch(brock, rudra);
        StepLadder step_ladder = new StepLadder(dean, roman);
        ChampionsTrophy trophy = new ChampionsTrophy(brock, roman, dean, rudra);
        One_on_One.startMatch();
        step_ladder.startMatch();
        trophy.startMatch();

    }
}
