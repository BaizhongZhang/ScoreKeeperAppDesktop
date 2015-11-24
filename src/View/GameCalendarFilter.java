package View;

import Model.LiveMatchManager;
import Model.Team;
import WebService.Constants;
import WebService.JsonTask;
import WebService.TaskListener;
import WebService.TaskType;
import javafx.geometry.VerticalDirection;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Created by Baizhong Zhang on 2015/11/14.
 */
public class GameCalendarFilter extends JPanel implements TaskListener{

    private TaskListener taskListener = this;
    Properties dateFormat = new Properties();
    UtilDateModel model = new UtilDateModel();
    JButton b1 = new JButton("OK");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String selectedDate;
    ArrayList<LiveMatchManager> lmmAryLst = new ArrayList<>();
    LiveMatchManager lmm;
    JFrame timeSelectFrame = new JFrame("Date Selector");
    JPanel timeSelectPanel = new JPanel();
    JPanel matchPanel = new JPanel();
    JLabel userIndicator = new JLabel("Select date to view game schedule");

    JPanel mainLayout = new JPanel();
    public void dateSelector(){

        //timeSelectFrame.add(timeSelectPanel);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                //Server is online
                selectedDate = sdf.format(model.getValue());
                JsonTask jt = new JsonTask(TaskType.SCHEDULE,taskListener);
                jt.execute();
                */
                //testing
                selectedDate = sdf.format(model.getValue());
                jsonScheduleParsing(Constants.RESULT_SCHEDULE);
                ArrayList<Team> teamNames = lmm.getParticipateTeams();// has the team name
                JLabel dateScheduleTitle = new JLabel(selectedDate + " Schedule");
                dateScheduleTitle.setAlignmentX(20f);
                dateScheduleTitle.setFont(new Font("Serif", Font.BOLD, 20));
                mainLayout.add(dateScheduleTitle);
                String team1 = teamNames.get(0).getTeamName();
                String team2 = teamNames.get(1).getTeamName();

                JLabel match = new JLabel(team1 + " VS " +team2+ "  ");
                match.setBackground(Color.blue);
                match.setFont(new Font("Serif", Font.BOLD, 30));
                JButton viewMatch = new JButton("View");
                viewMatch.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        LiveModeView view = new LiveModeView();
                        view.getLiveModeView();
                    };
                });
                matchPanel.add(match);
                matchPanel.add(viewMatch);
                mainLayout.add(matchPanel);
            }

        });
        mainLayout.setLayout(new BoxLayout(mainLayout, BoxLayout.PAGE_AXIS));
        timeSelectFrame.add(mainLayout);
        userIndicator.setFont(new Font("Serif", Font.BOLD, 20));
        timeSelectPanel.add(userIndicator);
        //timeSelectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeSelectFrame.setSize(800, 600);
        timeSelectFrame.setVisible(true);
        //timeSelectFrame.setLocationRelativeTo(null);
        dateFormat.put("text.today", "Today");
        dateFormat.put("text.month", "Month");
        dateFormat.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model,dateFormat);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        timeSelectPanel.add(datePicker);
        timeSelectPanel.add(b1);
        mainLayout.add(timeSelectPanel);
    }

    @Override
    public void onTaskCompleted(TaskType taskType, String result) {
      //  String buttonSelectedDate = selectedDate;
        jsonScheduleParsing(result);
    }

    private void jsonScheduleParsing(String httpResult) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            JSONObject jsonResponse = new JSONObject(httpResult);
            JSONArray jsonTeamAry = jsonResponse.getJSONArray("schedule");

            for (int i = 0; i < jsonTeamAry.length(); i++) {
                JSONObject jsonScheduleObj = jsonTeamAry.getJSONObject(i);

                String matchDate = jsonScheduleObj.getString("date");

                if (matchDate.equals(selectedDate)) {
                    ArrayList<Team> matchTeams = new ArrayList<>();
                    Team awayTeam = new Team(jsonScheduleObj.getString("away_team"));
                    Team homeTeam = new Team(jsonScheduleObj.getString("home_team"));
                    matchTeams.add(0, awayTeam);
                    matchTeams.add(1, homeTeam);
                    LiveMatchManager lmm = new LiveMatchManager(matchTeams, jsonScheduleObj.getString("location"), matchDate);
                    lmmAryLst.add(lmm);
                }
            }

        } catch (Exception e) {
            lmmAryLst.clear();
        }

        if (lmmAryLst.size() != 0) {
            for(int i = 0; i< lmmAryLst.size(); i++){
                lmm = lmmAryLst.get(i);
            }
        }
    }
}
