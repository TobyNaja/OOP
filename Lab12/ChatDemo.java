import javax.swing.*;
import java.awt.*;
import java.io.*;


public class ChatDemo {
     private JFrame fr;
     private JPanel pn;
     private JTextArea ar;
     private JTextField txt;
     private JButton submit, reset;
     private HandleEvent handle;
     
     public ChatDemo(){
         fr = new JFrame("ChatDemo");
         pn = new JPanel();
         ar = new JTextArea(20,45);
         txt = new JTextField(45);
         submit = new JButton("Submit");
         reset = new JButton("Reset");
         handle = new HandleEvent(this);
         
         pn.setLayout(new FlowLayout());
         pn.add(submit);
         pn.add(reset);
         submit.addActionListener(handle);
         reset.addActionListener(handle);
         
         fr.addWindowListener(handle);
         fr.setLayout(new BorderLayout());
         ar.setEditable(false);
         fr.add(ar ,BorderLayout.NORTH);
         fr.add(txt ,BorderLayout.CENTER);
         fr.add(pn ,BorderLayout.SOUTH);
         
         fr.pack();
         fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         fr.setVisible(true);
         
     }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPn() {
        return pn;
    }

    public void setPn(JPanel pn) {
        this.pn = pn;
    }

    public JTextArea getAr() {
        return ar;
    }

    public void setAr(JTextArea ar) {
        this.ar = ar;
    }

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JButton getSubmit() {
        return submit;
    }

    public void setSubmit(JButton submit) {
        this.submit = submit;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public HandleEvent getHandle() {
        return handle;
    }

    public void setHandle(HandleEvent handle) {
        this.handle = handle;
    }
     
     
}
