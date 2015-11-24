package View; /**
 * Created by Baizhong Zhang on 2015/11/11.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JPasswordField p1;
    JButton leagueSchedule, leagueManager, liveMode, batchMode;

    Login()
    {
        setTitle("Scorekeeper View.Login in window");
        setVisible(true);
        setSize(600, 300);
        setLayout(null);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Welcome");
        l1.setForeground(Color.black);
        l1.setFont(new Font("Serif", Font.BOLD, 20));

        JLabel NSA = new JLabel("National Soccer Association");
        NSA.setForeground(Color.black);
        NSA.setFont(new Font("Serif", Font.BOLD, 20));


        l2 = new JLabel("Enter Username:");
        l3 = new JLabel("Enter Password:");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Login");

        l1.setBounds(260, 30, 400, 30);
        NSA.setBounds(180, 50, 400, 30);
        l2.setBounds(80, 110, 200, 30);
        l3.setBounds(80, 140, 200, 30);
        tf1.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 140, 200, 30);
        btn1.setBounds(80, 180, 100, 30);

        add(l1);
        add(NSA);
        add(l2);
        add(tf1);
        add(l3);
        add(p1);
        add(btn1);
        btn1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {

        showData();
    }

    public void showData()
    {
        JFrame f1 = new JFrame();
        JLabel l, l0;

        String str1 = tf1.getText();
        char[] p = p1.getPassword();
        String str2 = new String(p);
        try
        {
            if (str1.equalsIgnoreCase("admin") && str2.equalsIgnoreCase("admin"))
            {
                mainPage main = new mainPage();
                main.getMainPage();
            } else
            {
                l = new JLabel();
                l.setText("Welcome! my Soccer lover" );
                l.setForeground(Color.red);
                l.setFont(new Font("Serif", Font.BOLD, 30));
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
    }
    public static void main(String arr[])
    {
        new Login();
    }
}