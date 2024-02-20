package Quarter3.JavaSwingHehe.try2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class boop extends JFrame implements ActionListener {
    private JButton button;
    private JTextField text;
    private double cnt;

    boop() {
        ImageIcon img = new ImageIcon("smile.jpeg");

        text = new JTextField();
        cnt = 1;
        text.setText("marek stink count: " + cnt);
        text.setBounds(0, 0, 250, 20);
        this.add(text);


        button = new JButton();
        button.setBounds(100, 100, 250, 500);
        button.addActionListener(this);
        button.setText("YOU STINK");
        button.setFocusable(false);
        button.setIcon(img);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            cnt += (cnt * (Math.random() * Math.random() * Math.random()));
            text.setText("marek stink count: " + cnt);
        }
    }

    public static void main(String[] args) {
        boop b = new boop();
    }
}
