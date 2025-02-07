import java.awt.event.*;

public class EventHandling02 implements ActionListener , WindowListener {
    private TellerGUI gui;
    public EventHandling02(TellerGUI gui){
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        double num1 = Double.parseDouble(gui.getTxt1().getText());
        double num2 = Double.parseDouble(gui.getTxt2().getText());
        if (ae.getActionCommand().equals("Deposit")){
            num1 = num1 + num2;
            gui.getTxt2().setText("");
        }
        else if (ae.getActionCommand().equals("Withdraw")){
            if (num1 <= num2){
                num1 = 0;
                gui.getTxt2().setText("");
            }
            else{
                num1 = num1 - num2;
                gui.getTxt2().setText("");
            }
        }
        else if (ae.getActionCommand().equals("Exit")){
            System.exit(0);
        }
        gui.getTxt1().setText(String.valueOf(num1));
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
}
