package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by HenryChiang on 15-11-03.
 */
public class PlayerRankingManager implements RankingManager{

    public ArrayList<Player> playerArrayList = new ArrayList<>();

    public PlayerRankingManager(){

    }

    public PlayerRankingManager(ArrayList<Player> playerArrayList) {
        this.playerArrayList = playerArrayList;
    }

    public ArrayList<Player> getPlayerArrayList() {
        return playerArrayList;
    }

    public void setPlayerArrayList(ArrayList<Player> playerArrayList) {
        this.playerArrayList = playerArrayList;
    }


    @Override
    public void arrangeTotalPoints() {

    }

    @Override
    public void arrangeTotalAttempt() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfAttempt()-p1.getNumOfAttempt();
            }
        });
    }

    @Override
    public void arrangeTotalOnTarget() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfOnTarget()-p1.getNumOfOnTarget();
            }
        });
    }

    @Override
    public void arrangeTotalScored() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfScored()-p1.getNumOfScored();
            }
        });

    }

    @Override
    public void arrangeTotalPenalties() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfPenalties()-p1.getNumOfPenalties();
            }
        });
    }

    @Override
    public void arrangeTotalYellowCards() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfYellowCards()-p1.getNumOfYellowCards();
            }
        });
    }

    @Override
    public void arrangeTotalRedCards() {

        Collections.sort(playerArrayList, new Comparator<Player>() {
            public int compare(Player p1, Player p2) {
                return p2.getNumOfRedCards()-p1.getNumOfRedCards();
            }
        });
    }
}
