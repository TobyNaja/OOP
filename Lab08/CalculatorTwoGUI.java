
package lab08_03;

import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel pr1,pr2;
    private JButton br1, br2,br3, br4,br5,br6,br7,br8,br9,br10,br11,br12,br13,br14,br15,br16;
    private JTextField txt;
    
    public CalculatorTwoGUI(){
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setLayout(new BorderLayout());
        
        pr1 = new JPanel();
        pr2 = new JPanel();
        
        txt = new JTextField();
        fr.add(txt,BorderLayout.NORTH);
        pr2.setLayout(new GridLayout(4,4));
        
        br1 = new JButton("1");
        br2 = new JButton("2");
        br3 = new JButton("3");
        br4 = new JButton("4");
        br5 = new JButton("5");
        br6 = new JButton("6");
        br7 = new JButton("7");
        br8 = new JButton("8");
        br9 = new JButton("9");
        br10 = new JButton("+");
        br11 = new JButton("-");
        br12 = new JButton("x");
        br13 = new JButton("/");
        br14 = new JButton("=");
        br15 = new JButton("c");
        br16 = new JButton("0");
        
        pr2.add(br7);
        pr2.add(br8);
        pr2.add(br9);
        pr2.add(br10);
        pr2.add(br4);
        pr2.add(br5);
        pr2.add(br6);
        pr2.add(br11);
        pr2.add(br1);
        pr2.add(br2);
        pr2.add(br3);
        pr2.add(br12);
        pr2.add(br16);
        pr2.add(br15);
        pr2.add(br14);
        pr2.add(br13);
        fr.add(pr2,BorderLayout.CENTER);
        fr.setVisible(true);
    }
}
