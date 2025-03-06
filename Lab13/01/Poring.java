import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Poring {
    private JFrame fr;
    private JLabel poring, count;
    private ImageIcon image;
    private EventHandlingPoring ev;
    private static int countValue = 0;
    
    public Poring(){
        fr = new JFrame("Poring");
        poring = new JLabel();
        count = new JLabel("" + (++countValue));
        image = new ImageIcon("poring.png");
        ev = new EventHandlingPoring(this);
        
        Image scaledImage = image.getImage().getScaledInstance(110, 110, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
        fr.setLayout(new FlowLayout());
        poring.setIcon(scaledIcon);
        fr.add(poring);
        fr.add(count);
        
        poring.addMouseListener(ev);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setSize(220, 170);
        fr.setResizable(false);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JLabel getPoring() {
        return poring;
    }

    public void setPoring(JLabel poring) {
        this.poring = poring;
    }

    public JLabel getCount() {
        return count;
    }

    public void setCount(JLabel count) {
        this.count = count;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public EventHandlingPoring getEv() {
        return ev;
    }

    public void setEv(EventHandlingPoring ev) {
        this.ev = ev;
    }
    
    public static int getCountValue() {
        return countValue;
    }

    public static void setCountValue(int countValue) {
        Poring.countValue = countValue;
    }
}
