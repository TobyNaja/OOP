
package lab02;

import javax.swing.JFrame;

public class MyFrame {
    private JFrame fr;
    private MyClock clock;
    private Thread t;

    public MyFrame() {
        fr = new JFrame("My Clock");
        clock = new MyClock();
        t = new Thread(clock);

        t.start();
        fr.add(clock);

        fr.setSize(300, 130);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();

    }

}