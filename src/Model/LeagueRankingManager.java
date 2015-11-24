package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by HenryChiang on 15-11-03.
 */
public class LeagueRankingManager implements RankingManager {


    public ArrayList<Team> teamArrayList = new ArrayList<>();


    public LeagueRankingManager(){

    }

    public ArrayList<Team> getTeamArrayList() {
        return teamArrayList;
    }

    public void setTeamArrayList(ArrayList<Team> teamArrayList) {
        this.teamArrayList = teamArrayList;
    }

    @Override
    public void arrangeTotalPoints() {

        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getTotalPoints() - t1.getTotalPoints();
            }
        });
    }

    @Override
    public void arrangeTotalAttempt() {


        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfAttempt() - t1.getNumOfAttempt();
            }
        });

    }

    @Override
    public void arrangeTotalOnTarget() {

        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfOnTarget() - t1.getNumOfOnTarget();
            }
        });

    }

    @Override
    public void arrangeTotalScored() {

        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfScored() - t1.getNumOfScored();
            }
        });

    }

    @Override
    public void arrangeTotalPenalties() {

        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfPenalties() - t1.getNumOfPenalties();
            }
        });

    }

    @Override
    public void arrangeTotalYellowCards() {
        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfYellowCards() - t1.getNumOfYellowCards();
            }
        });


    }

    @Override
    public void arrangeTotalRedCards() {

        Collections.sort(teamArrayList, new Comparator<Team>() {
            public int compare(Team t1, Team t2) {
                return t2.getNumOfRedCards() - t1.getNumOfRedCards();
            }
        });

    }
}
