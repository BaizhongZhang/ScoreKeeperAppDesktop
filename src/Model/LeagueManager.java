package Model;

import java.util.Date;
import java.util.Hashtable;

/**
 * Created by HenryChiang on 15-11-05.
 */
public class LeagueManager {

    public String leagueName;
    public Date startDate, endDate;
    public Hashtable<Date,MatchManager> leagueSchedule;

    public Hashtable<String,Team> teams;
    public Hashtable<String,Player> players;

    public MatchManager matchManager;
    public RankingManager rankingManager;

    public LeagueManager(String leagueName, Date startDate, Date endDate, Hashtable<Date, MatchManager> leagueSchedule, Hashtable<String, Team> teams, Hashtable<String, Player> players, MatchManager matchManager, RankingManager rankingManager) {
        this.leagueName = leagueName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.leagueSchedule = leagueSchedule;
        this.teams = teams;
        this.players = players;
        this.matchManager = matchManager;
        this.rankingManager = rankingManager;
    }



    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Hashtable<Date, MatchManager> getLeagueSchedule() {
        return leagueSchedule;
    }

    public void setLeagueSchedule(Hashtable<Date, MatchManager> leagueSchedule) {
        this.leagueSchedule = leagueSchedule;
    }

    public Hashtable<String, Team> getTeams() {
        return teams;
    }

    public void setTeams(Hashtable<String, Team> teams) {
        this.teams = teams;
    }

    public Hashtable<String, Player> getPlayers() {
        return players;
    }

    public void setPlayers(Hashtable<String, Player> players) {
        this.players = players;
    }

    public MatchManager getMatchManager() {
        return matchManager;
    }

    public void setMatchManager(MatchManager matchManager) {
        this.matchManager = matchManager;
    }

    public RankingManager getRankingManager() {
        return rankingManager;
    }

    public void setRankingManager(RankingManager rankingManager) {
        this.rankingManager = rankingManager;
    }
}
