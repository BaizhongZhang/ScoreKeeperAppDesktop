package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by HenryChiang on 15-11-05.
 */
public class LiveMatchManager extends MatchManager {

    public LiveMatchManager(ArrayList<Team> matchTeams, String location, String date) {
        setParticipateTeams(matchTeams);
        setLocation(location);
        setDate(date);
    }


}
