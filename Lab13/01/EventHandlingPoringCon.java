import java.awt.event.*;
import java.util.ArrayList;

public class EventHandlingPoringCon implements ActionListener, WindowListener {
    private static ArrayList<Poring> frame = new ArrayList<>();
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Poring p = new Poring();
        frame.add(p);

        Poring.setCountValue(Poring.getCountValue() ); 
    }
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
//        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
