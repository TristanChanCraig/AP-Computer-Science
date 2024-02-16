package Quarter3.JavaSwingHehe.bruh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class bish {
    private JButton button;

    bish() {
        ImageIcon img = new ImageIcon("smile.jpeg");

        JButton button = new JButton("goofy");
        button.setBounds(200, 100, 100, 50);

        JLabel label = new JLabel();
        label.setText("jonah is a bully");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        JFrame frame = new JFrame();
        frame.setTitle("Jonah Is Stinky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(0, 169, 255));

        frame.getContentPane().add(button);

        frame.add(label);
    }


    public static void main(String[] args) {


    }
}
