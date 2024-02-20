package Quarter3.JavaSwingHehe.try3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RAHHHH extends JFrame implements ActionListener {
    private JButton button;
    private JTextField text;
    private double cnt;
    private JLabel Text;
    private JButton button2;
    private JButton button3;

    RAHHHH() {
        ImageIcon img = new ImageIcon("smile.jpeg");

        text = new JTextField();
        cnt = 1;
        text.setText("marek stink count: " + cnt);
        this.add(text);
        button.addActionListener(this);
        this.add(button);

        button.setIcon(img);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            cnt += (cnt * 0.1);
            text.setText("marek stink count: " + cnt);
        }

    }

    public static void main(String[] args) {
        RAHHHH r = new RAHHHH();
        JFrame frame = new JFrame();
//        frame.setContentPane();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    }
}
