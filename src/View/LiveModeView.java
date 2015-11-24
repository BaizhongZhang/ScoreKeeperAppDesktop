package View;

import WebService.TaskListener;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Baizhong Zhang on 2015/11/23.
 */
public class LiveModeView extends JPanel {
    JFrame liveModeWindow = new JFrame("Live mode view");
    private JButton player, team, clear, update;
    private JLabel title,teamLabel, info, value;
   // private JComboBox teamList, infoType;
    private JFormattedTextField input;
    JPanel backgroundPanel = new JPanel();
    JPanel titlePanel = new JPanel();
    JPanel middle = new JPanel();
    JPanel bottom = new JPanel();
    JPanel buttonPanel = new JPanel();
    JFormattedTextField txt = new JFormattedTextField("Number only!");

    public void getLiveModeView(){
        backgroundPanel.setLayout(new BoxLayout(backgroundPanel, BoxLayout.PAGE_AXIS));
       // middle.setLayout(new GridLayout(1,2));
        bottom.setLayout(new GridLayout(6,1));
       // buttonPanel.setLayout(new GridLayout(1,2));

        liveModeWindow.setTitle("Live mode view");
        liveModeWindow.setVisible(true);
        liveModeWindow.setLocationRelativeTo(null);
        liveModeWindow.setSize(400, 600);

        title = new JLabel("Input Data For");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setVerticalAlignment(JLabel.TOP);
        title.setFont(new Font("Serif", Font.BOLD, 25));
        titlePanel.setPreferredSize(new Dimension(400, 60));
        titlePanel.add(title);
        backgroundPanel.add(titlePanel);

        player = new JButton("PLAYER");
        team = new JButton("TEAM");
        middle.add(player,0);
        middle.add(team,1);
        backgroundPanel.add(middle);

        teamLabel = new JLabel("TEAM");//TEAM 1
        teamLabel.setFont(new Font("Serif", Font.BOLD, 25));
        teamLabel.setHorizontalAlignment(JLabel.LEFT);

        String[] soccerTeam = new String[]{"Houston", "Los Angeles"};//2
        JComboBox<String> teamList = new JComboBox<>(soccerTeam) ;

        info = new JLabel("Information Type");//3
        info.setFont(new Font("Serif", Font.BOLD, 25));
        info.setHorizontalAlignment(JLabel.LEFT);

        String[] inputTypeList = new String[]{"Point", "Foul"};//4
        JComboBox<String> inputType = new JComboBox<>(inputTypeList) ;

        value = new JLabel("Value");//5
        value.setFont(new Font("Serif", Font.BOLD, 25));
        value.setHorizontalAlignment(JLabel.LEFT);

        txt.setFont(new Font("Serif", Font.BOLD, 25));//6

        bottom.add(teamLabel,0);
        bottom.add(teamList, 1);
        bottom.add(info,2);
        bottom.add(inputType,3);
        bottom.add(value,4);
        bottom.add(txt,5);
        backgroundPanel.add(bottom);

        clear = new JButton("CLEAR");
        update = new JButton("UPDATE");
        buttonPanel.setPreferredSize(new Dimension(400, 20));
        buttonPanel.add(clear,0);
        buttonPanel.add(update,1);
        backgroundPanel.add(buttonPanel);

        liveModeWindow.add(backgroundPanel);
    }

}
