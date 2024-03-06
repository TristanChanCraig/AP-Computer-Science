package Quarter3.JavaSwingHehe.game.main;

import Quarter3.JavaSwingHehe.game.main.GamePanel;

import javax.swing.*;

// This is a tutorial learning program for me

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("GOOFY AHH");

        GamePanel gp = new GamePanel();
        window.add(gp);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gp.startGameThread();
    }
}
