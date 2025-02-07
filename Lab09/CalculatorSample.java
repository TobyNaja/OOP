/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09;

import javax.swing.*;
import java.awt.*;


public class CalculatorSample {
    private JFrame fr;
    private JPanel pr1,pr2;
    private JButton br1, br2,br3, br4,br5,br6,br7,br8,br9,br10,br11,br12,br13,br14,br15,br16;
    private JTextField txt;
    private double num1 ,num2 ,total;
    private String oper;
    private EventHandling01 eventHandling;
    
    public CalculatorSample(){
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 200);
        fr.setLayout(new BorderLayout());
        
        pr1 = new JPanel();
        pr2 = new JPanel();
        
        txt = new JTextField();
        txt.setEditable(false);
        fr.add(txt,BorderLayout.NORTH);
        pr2.setLayout(new GridLayout(4,4));
        eventHandling = new EventHandling01(this);
        
        br1 = new JButton("1");
        br2 = new JButton("2");
        br3 = new JButton("3");
        br4 = new JButton("4");
        br5 = new JButton("5");
        br6 = new JButton("6");
        br7 = new JButton("7");
        br8 = new JButton("8");
        br9 = new JButton("9");
        br10 = new JButton("+");
        br11 = new JButton("-");
        br12 = new JButton("X");
        br13 = new JButton("/");
        br14 = new JButton("=");
        br15 = new JButton("C");
        br16 = new JButton("0");
        
        pr2.add(br7);
        pr2.add(br8);
        pr2.add(br9);
        pr2.add(br10);
        pr2.add(br4);
        pr2.add(br5);
        pr2.add(br6);
        pr2.add(br11);
        pr2.add(br1);
        pr2.add(br2);
        pr2.add(br3);
        pr2.add(br12);
        pr2.add(br16);
        pr2.add(br15);
        pr2.add(br14);
        pr2.add(br13);
        
        
        br1.addActionListener(eventHandling);
        br2.addActionListener(eventHandling);
        br3.addActionListener(eventHandling);
        br4.addActionListener(eventHandling);
        br5.addActionListener(eventHandling);
        br6.addActionListener(eventHandling);
        br7.addActionListener(eventHandling);
        br8.addActionListener(eventHandling);
        br9.addActionListener(eventHandling);
        br10.addActionListener(eventHandling);
        br11.addActionListener(eventHandling);
        br12.addActionListener(eventHandling);
        br13.addActionListener(eventHandling);
        br14.addActionListener(eventHandling);
        br15.addActionListener(eventHandling);
        br16.addActionListener(eventHandling);
        
        fr.add(pr2,BorderLayout.CENTER);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPr1() {
        return pr1;
    }

    public void setPr1(JPanel pr1) {
        this.pr1 = pr1;
    }

    public JPanel getPr2() {
        return pr2;
    }

    public void setPr2(JPanel pr2) {
        this.pr2 = pr2;
    }

    public JButton getBr1() {
        return br1;
    }

    public void setBr1(JButton br1) {
        this.br1 = br1;
    }

    public JButton getBr2() {
        return br2;
    }

    public void setBr2(JButton br2) {
        this.br2 = br2;
    }

    public JButton getBr3() {
        return br3;
    }

    public void setBr3(JButton br3) {
        this.br3 = br3;
    }

    public JButton getBr4() {
        return br4;
    }

    public void setBr4(JButton br4) {
        this.br4 = br4;
    }

    public JButton getBr5() {
        return br5;
    }

    public void setBr5(JButton br5) {
        this.br5 = br5;
    }

    public JButton getBr6() {
        return br6;
    }

    public void setBr6(JButton br6) {
        this.br6 = br6;
    }

    public JButton getBr7() {
        return br7;
    }

    public void setBr7(JButton br7) {
        this.br7 = br7;
    }

    public JButton getBr8() {
        return br8;
    }

    public void setBr8(JButton br8) {
        this.br8 = br8;
    }

    public JButton getBr9() {
        return br9;
    }

    public void setBr9(JButton br9) {
        this.br9 = br9;
    }

    public JButton getBr10() {
        return br10;
    }

    public void setBr10(JButton br10) {
        this.br10 = br10;
    }

    public JButton getBr11() {
        return br11;
    }

    public void setBr11(JButton br11) {
        this.br11 = br11;
    }

    public JButton getBr12() {
        return br12;
    }

    public void setBr12(JButton br12) {
        this.br12 = br12;
    }

    public JButton getBr13() {
        return br13;
    }

    public void setBr13(JButton br13) {
        this.br13 = br13;
    }

    public JButton getBr14() {
        return br14;
    }

    public void setBr14(JButton br14) {
        this.br14 = br14;
    }

    public JButton getBr15() {
        return br15;
    }

    public void setBr15(JButton br15) {
        this.br15 = br15;
    }

    public JButton getBr16() {
        return br16;
    }

    public void setBr16(JButton br16) {
        this.br16 = br16;
    }

    public JTextField getTxt() {
        return txt;
    }

    public void setTxt(JTextField txt) {
        this.txt = txt;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public EventHandling01 getEventHandling() {
        return eventHandling;
    }

    public void setEventHandling(EventHandling01 eventHandling) {
        this.eventHandling = eventHandling;
    }

}
