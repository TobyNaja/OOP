
package lab09;

import java.awt.event.*;

public class EventHandling01 implements ActionListener , WindowListener{ 
    private CalculatorSample gui;
     
    public EventHandling01(CalculatorSample gui){
       this.gui = gui;       
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String command = ae.getActionCommand();
        if (command.matches("[0-9]")) {
            gui.getTxt().setText(gui.getTxt().getText() + command);
        }
        
        if (command.matches("[+-/X]")) {
            gui.setNum1(Double.parseDouble(gui.getTxt().getText()));
            gui.setOper(command);
            gui.getTxt().setText("");
        }
        
        if (command.matches("=")){
            gui.setNum2(Double.parseDouble(gui.getTxt().getText()));
        
            if (gui.getOper().equals("+") ){
                gui.setTotal(gui.getNum1() + gui.getNum2());
            }
            else if (gui.getOper().equals("-") ){
                gui.setTotal(gui.getNum1() - gui.getNum2());
            }
            else if (gui.getOper().equals("/") ){
                gui.setTotal(gui.getNum1() / gui.getNum2());
            }
            else if (gui.getOper().equals("X") ){
                gui.setTotal(gui.getNum1() * gui.getNum2());
            }
            gui.getTxt().setText(String.valueOf(gui.getTotal()));
        }
        if (command.equals("C")) {
            gui.getTxt().setText("");
            gui.setNum1(0);
            gui.setNum2(0);
            gui.setOper("");
        }
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
