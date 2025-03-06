
package lab03;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class MyClockPause extends JLabel implements Runnable {

    private int sec;
    private int min;
    private int hour;
    private boolean resume = true;

    public synchronized void continueTime() {
        resume = !resume;
        if (resume) {
            System.out.println("Resume");
            notifyAll();
        } else {
            System.out.println("pause");
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (!resume) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
            setFont(new Font("Times New Roman", Font.PLAIN, 12));
            setHorizontalAlignment(SwingConstants.CENTER);

            setText(String.format("%02d:%02d:%02d", hour, min, sec));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            sec++;
            if (sec > 59) {
                min++;
                sec = 0;
            } else if (min > 59) {
                hour++;
                min = 0;

            }

        }
    }

}
