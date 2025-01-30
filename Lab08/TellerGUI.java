package lab08_03;

import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel pr1,pr2;
    private JButton br1, br2,br3;
    private JTextField txt1, txt2;
    private JLabel lb1,lb2;
    
    public TellerGUI(){
        fr = new JFrame("Tell GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setLayout(new GridLayout(2,1));
        
        pr1 = new JPanel();
        pr2 = new JPanel();
        
        pr1.setLayout(new GridLayout(2,2));
        lb1 = new JLabel(" Balance");
        lb2 = new JLabel(" Amount");
        txt1 = new JTextField("6000");
        txt1.setEditable(false);
        txt2 = new JTextField();
        
        pr1.add(lb1);
        pr1.add(txt1);
        pr1.add(lb2);
        pr1.add(txt2);
        fr.add(pr1);
        
        br1 = new JButton("Deposit");
        br2 = new JButton("Withdraw");
        br3 = new JButton("Exit");
        pr2.setLayout(new FlowLayout());
        pr2.add(br1);
        pr2.add(br2);
        pr2.add(br3);
        fr.add(pr2);
        
        fr.setVisible(true);
    }
   
}
