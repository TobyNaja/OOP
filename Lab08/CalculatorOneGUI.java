package lab08_03;

import javax.swing.*;
import java.awt.*;

public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel pn;
    private JTextField textField1, textField2,textField3;
    private JButton bn1, bn2, bn3, bn4;
    
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setLayout(new GridLayout(4,1));

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        fr.add(textField1);
        fr.add(textField2);
        
        pn = new JPanel();
        pn.setLayout(new FlowLayout());

        bn1 = new JButton("บวก");
        bn2 = new JButton("ลบ");
        bn3 = new JButton("คูณ");
        bn4 = new JButton("หาร");

        pn.add(bn1);
        pn.add(bn2);
        pn.add(bn3);
        pn.add(bn4);

        fr.add(pn);
        fr.add(textField3);
        fr.setVisible(true);
    }
}
