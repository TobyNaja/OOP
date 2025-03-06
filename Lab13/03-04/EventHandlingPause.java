
package lab03;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventHandlingPause implements MouseListener {
    private MyClockPause clock = new MyClockPause();
    
    public EventHandlingPause(MyClockPause clock) {
        this.clock = clock;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        clock.continueTime();
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
