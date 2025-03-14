/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pfew;

import java.awt.event.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventB implements ActionListener, WindowListener  {
    private ClientBChat gui;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private static File file = new File("chat_history.dat");
    
    
    public EventB(ClientBChat gui){
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Send")){
            String txt = gui.getTxt().getText();
            String time = dtf.format(LocalDateTime.now());
            gui.getAr().append(time + " " + "B :" + txt+"\n");
            gui.getTxt().setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        if (file.exists()){
            try (FileInputStream fin = new FileInputStream(file);
                    DataInputStream din = new DataInputStream(fin);){
                String txt = din.readUTF();
                if (!txt.isEmpty()){
                    gui.getAr().append(txt);
                }
            }catch (IOException ex) {
                System.exit(0);
            }
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream(file);
                DataOutputStream dout = new DataOutputStream(fout);){
            dout.writeUTF(gui.getAr().getText());
        } catch (IOException ex) {
            System.exit(0);
        }
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


