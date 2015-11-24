package Model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by HenryChiang on 15-11-03.
 */
public abstract class MatchManager {

    public String location;
    public String date;
    public Time startTime, endTime;
    public ArrayList<Team> participateTeams;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Team> getParticipateTeams() {
        return participateTeams;
    }

    public void setParticipateTeams(ArrayList<Team> participateTeams) {
        this.participateTeams = participateTeams;
    }
}
