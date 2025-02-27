import java.awt.event.*;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class HandleEvent implements ActionListener , WindowListener {
    private File file = new File("ChatDemo.dat");
    private ChatDemo gui;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    
    public HandleEvent(ChatDemo gui){
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.equals("Submit")){
            String message = gui.getTxt().getText();
            String time = dtf.format(LocalDateTime.now());
            gui.getAr().append(time + ":" + message + "\n");
            gui.getTxt().setText("");
        }
        else if (command.equals("Reset")){
            gui.getAr().setText("");
            gui.getTxt().setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (file.exists()){
            try (FileInputStream fin = new FileInputStream("file");
                DataInputStream din = new DataInputStream(fin);){
                String history = din.readUTF();
                if (!history.isEmpty()){
                    gui.getAr().append(history);
                }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("file"); 
                DataOutputStream dout = new DataOutputStream(fout);) {
            dout.writeUTF(gui.getAr().getText());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        System.exit(0);
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
