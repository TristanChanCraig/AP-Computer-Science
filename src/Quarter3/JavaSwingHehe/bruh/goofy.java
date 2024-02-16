package Quarter3.JavaSwingHehe.bruh;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class goofy extends JFrame implements ActionListener {
    JButton button;

    void MyFrame() {
        button = new JButton();
        button.setBounds(200, 100, 100, 50);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400,400);
        this.setVisible(true);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            System.out.println("hi");
        }
    }
}
