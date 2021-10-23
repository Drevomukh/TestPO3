package TestPO3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI {

    JPanel panel = new JPanel();
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    int i = 0;
    int t = 0;
    JLabel label1 = new JLabel("Result: " + i +" "+ "X" +" "+ t);
    JLabel label2 = new JLabel("Last Scorer: ");
    JLabel label3 = new JLabel("Winner: ");

    public SimpleGUI(int a, int b) {
        super("Простое графическое окно");
        setSize(a, b);
        setVisible(true);

        add(panel);
        panel.setLayout(new GridLayout(3,3));
        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);



    }
}
