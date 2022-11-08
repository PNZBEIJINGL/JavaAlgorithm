package com.java6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerTest {
    private static int delay = 1000;
    private static int initialDelay = 5000;
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("count = " + count++);
            }
        };

        Timer timer = new Timer(delay, listener);
        timer.setInitialDelay(initialDelay);

        //timer.setRepeats(false);
        timer.start();

        for (; ; ) {
            if (count == 5)
                timer.setDelay(500);
            if (count == 10)
                timer.setRepeats(false);
        }

    }


}
