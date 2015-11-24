package Model;

import java.util.ArrayList;

/**
 * Created by HenryChiang on 15-11-03.
 */
public class Team implements Infraction, ShotManager{

    public String teamName;
    public int totalPoints;
    public Player player;
    public ArrayList<Player> teamPlayers;

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public Team(String teamName, int totalPoints) {
        this.teamName = teamName;
        this.totalPoints = totalPoints;
    }

    public Team(String teamName, int totalPoints, ArrayList<Player> teamPlayers) {
        this.teamName = teamName;
        this.totalPoints = totalPoints;
        this.teamPlayers = teamPlayers;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    @Override
    public void setNumOfAttempt(int numOfAttempt) {

    }

    @Override
    public int getNumOfAttempt() {

        int numOfAttempt = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfAttempt += getTeamPlayers().get(i).getNumOfAttempt();
        }

        return numOfAttempt;
    }


    @Override
    public void setNumOfOnTarget(int numOfOnTarget) {

    }

    @Override
    public int getNumOfOnTarget() {
        int numOfOnTarget = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfOnTarget += getTeamPlayers().get(i).getNumOfOnTarget();
        }

        return numOfOnTarget;
    }

    @Override
    public void setNumOfScored(int numOfScored) {

    }

    @Override
    public int getNumOfScored() {
        int numOfScored = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfScored += getTeamPlayers().get(i).getNumOfScored();
        }

        return numOfScored;
    }

    @Override
    public void setNumOfPenalties(int numOfPenalties) {

    }

    @Override
    public void setNumOfYellowCards(int numOfYellowCards) {

    }

    @Override
    public void setNumOfRedCards(int numOfRedCards) {

    }

    @Override
    public int getNumOfPenalties() {
        int numOfPenalties = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfPenalties += getTeamPlayers().get(i).getNumOfPenalties();
        }

        return numOfPenalties;
    }

    @Override
    public int getNumOfYellowCards() {
        int numOfYellowCards = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfYellowCards += getTeamPlayers().get(i).getNumOfYellowCards();
        }

        return numOfYellowCards;
    }

    @Override
    public int getNumOfRedCards() {
        int numOfRedCards = 0;
        for(int i = 0 ; i < getTeamPlayers().size() ; i ++){
            numOfRedCards += getTeamPlayers().get(i).getNumOfRedCards();
        }

        return numOfRedCards;
    }
}
