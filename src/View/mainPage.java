package View; /**
 * Created by Baizhong Zhang on 2015/11/13.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainPage extends JFrame {
    JButton leagueSchedule, leagueManager, liveMode, batchMode;
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame("Main Page");
    public mainPage(){
;       panel.setLayout(new GridLayout(4,1));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        leagueSchedule = new JButton("League Schedule");
        leagueManager = new JButton("League Manager");
        liveMode = new JButton("Live Mode");
        batchMode = new JButton("Batch Mode");

        leagueManager.setBounds(100, 100, 200, 30);
        leagueSchedule.setBounds(100, 130, 200, 30);
        liveMode.setBounds(100, 160, 200, 30);
        batchMode.setBounds(100, 190, 200, 30);
        panel.add(leagueManager);
        panel.add(leagueSchedule);
        panel.add(liveMode);
        panel.add(batchMode);
        frame.add(panel);
    }
    public void getMainPage(){
        leagueSchedule.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                GameCalendarFilter gameCalendarFilter = new GameCalendarFilter();
                gameCalendarFilter.dateSelector();
            }
        });
    }
}
