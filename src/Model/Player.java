package Model;

/**
 * Created by HenryChiang on 15-11-03.
 */
public class Player implements Infraction, ShotManager{

    public String name;
    public String team;
    public int numOfAttempt,numOfOnTarget,numOfScored,numOfPenalties,numOfYellowCards,numOfRedCards;

    public Player(String name, String team, int numOfAttempt, int numOfOnTarget, int numOfScored, int numOfPenalties, int numOfYellowCards, int numOfRedCards) {
        this.name = name;
        this.team = team;
        this.numOfAttempt = numOfAttempt;
        this.numOfOnTarget = numOfOnTarget;
        this.numOfScored = numOfScored;
        this.numOfPenalties = numOfPenalties;
        this.numOfYellowCards = numOfYellowCards;
        this.numOfRedCards = numOfRedCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    @Override
    public void setNumOfAttempt(int numOfAttempt) {
        this.numOfAttempt =numOfAttempt;
    }

    @Override
    public int getNumOfAttempt() {
        return numOfAttempt;
    }

    @Override
    public void setNumOfOnTarget(int numOfOnTarget) {
        this.numOfOnTarget=numOfOnTarget;
    }

    @Override
    public int getNumOfOnTarget() {
        return numOfOnTarget;
    }

    @Override
    public void setNumOfScored(int numOfScored) {

        this.numOfScored=numOfScored;
    }

    @Override
    public int getNumOfScored() {
        return numOfScored;
    }

    @Override
    public void setNumOfPenalties(int numOfPenalties) {
        this.numOfPenalties=numOfPenalties;

    }

    @Override
    public void setNumOfYellowCards(int numOfYellowCards) {

        this.numOfYellowCards = numOfYellowCards;
    }

    @Override
    public void setNumOfRedCards(int numOfRedCards) {

        this.numOfRedCards = numOfRedCards;
    }

    @Override
    public int getNumOfPenalties() {
        return numOfPenalties;
    }

    @Override
    public int getNumOfYellowCards() {
        return numOfYellowCards;
    }

    @Override
    public int getNumOfRedCards() {
        return numOfRedCards;
    }
}
