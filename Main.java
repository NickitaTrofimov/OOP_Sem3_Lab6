package ru.mirea;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //new Game().setVisible(true);
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Game frame = new Game();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
