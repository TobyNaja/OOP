/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

import javax.swing.*;
import java.awt.*;

public class ClientAChat {
    private JFrame fr;
    private JPanel pn;
    private JTextField txt;
    private JTextArea ar;
    private JButton bn;
    private EventA ev;
    
    public ClientAChat(){
        fr = new JFrame("ClientAChat");
        txt = new JTextField(45);
        ar = new JTextArea(20,45);
        bn = new JButton("Send");
        ar.setEditable(false);
        ev = new EventA(this);
        
        fr.setLayout(new BorderLayout());
        fr.add(ar,BorderLayout.NORTH);
        fr.add(txt,BorderLayout.WEST);
        fr.add(bn,BorderLayout.EAST);
        
        fr.addWindowListener(ev);
        bn.addActionListener(ev);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
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

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public JTextArea getAr() {
        return ar;
    }

    public void setAr(JTextArea ar) {
        this.ar = ar;
    }

    public JButton getBn() {
        return bn;
    }

    public void setBn(JButton bn) {
        this.bn = bn;
    }

    public EventA getEv() {
        return ev;
    }

    public void setEv(EventA ev) {
        this.ev = ev;
    }
    
}
