import javax.swing.*;
import java.awt.*;

public class TellerGUI {
    private JFrame fr;
    private JPanel pr1,pr2;
    private JButton br1, br2,br3;
    private JTextField txt1, txt2;
    private JLabel lb1,lb2;
    private EventHandling02 event;
    
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
        
        event = new EventHandling02(this);
        txt1.addActionListener(event);
        br1.addActionListener(event);
        br2.addActionListener(event);
        br3.addActionListener(event);
        
        fr.setResizable(false);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPr1() {
        return pr1;
    }

    public void setPr1(JPanel pr1) {
        this.pr1 = pr1;
    }

    public JPanel getPr2() {
        return pr2;
    }

    public void setPr2(JPanel pr2) {
        this.pr2 = pr2;
    }

    public JButton getBr1() {
        return br1;
    }

    public void setBr1(JButton br1) {
        this.br1 = br1;
    }

    public JButton getBr2() {
        return br2;
    }

    public void setBr2(JButton br2) {
        this.br2 = br2;
    }

    public JButton getBr3() {
        return br3;
    }

    public void setBr3(JButton br3) {
        this.br3 = br3;
    }

    public JTextField getTxt1() {
        return txt1;
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public JTextField getTxt2() {
        return txt2;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }

    public JLabel getLb1() {
        return lb1;
    }

    public void setLb1(JLabel lb1) {
        this.lb1 = lb1;
    }

    public JLabel getLb2() {
        return lb2;
    }

    public void setLb2(JLabel lb2) {
        this.lb2 = lb2;
    }
    public EventHandling02 getEvent() {
        return event;
    }

    public void setEvent(EventHandling02 event) {
        this.event = event;
    }
   
}
