import javax.swing.*;
import java.awt.*;

public class PoringConstructor {
    private JFrame fr;
    private JButton add;
    private EventHandlingPoringCon ev;
    
    public PoringConstructor(){
        fr = new JFrame("Poring Constructor");
        fr.setSize(200, 100);
        add = new JButton("Add");
        ev = new EventHandlingPoringCon();
        
        add.addActionListener(ev);
        fr.addWindowListener(ev);
        
        fr.setLayout(new FlowLayout());
        fr.add(add);
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
