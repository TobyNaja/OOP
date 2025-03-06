import java.awt.event.*;

public class EventHandlingPoring implements ActionListener, MouseListener{
    private Poring por;
    
    public EventHandlingPoring(Poring por) {
        this.por = por;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        System.exit(0);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        por.getFr().dispose();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
