package Quarter3.JavaSwingHehe.bruh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kablam extends JFrame {
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public kablam() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txtName.getText() + " ,Hello");
            }
        });
    }

    public static void main(String[] args) {
        ImageIcon img = new ImageIcon("smile.jpeg");

        JLabel label = new JLabel();
        label.setText("jonah is a bully");
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        kablam h = new kablam();
        h.setContentPane(h.panelMain);
        h.setTitle("you stink");
        h.setSize(400, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.add(label);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

}
