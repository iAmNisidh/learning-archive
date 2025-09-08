import java.awt.event.*;
import javax.swing.*;

public class swing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setTitle("Vishal Pandey");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        // Label and text field for Num1
        JLabel label1 = new JLabel("Num1:");
        label1.setBounds(20, 20, 80, 25);
        frame.add(label1);

        JTextField jt1 = new JTextField();
        jt1.setBounds(100, 20, 100, 25);
        frame.add(jt1);

        // Label and text field for Num2
        JLabel label2 = new JLabel("Num2:");
        label2.setBounds(20, 60, 80, 25);
        frame.add(label2);

        JTextField jt2 = new JTextField();
        jt2.setBounds(100, 60, 100, 25);
        frame.add(jt2);

        // Button to add numbers
        JButton bt = new JButton("Add");
        bt.setBounds(100, 100, 100, 25);
        frame.add(bt);

        // Label to display result
        JLabel resultLabel = new JLabel( );
        resultLabel.setBounds(20, 140, 200, 25);
        frame.add(resultLabel);

        // Action Listener
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(jt1.getText());
                    int num2 = Integer.parseInt(jt2.getText());
                    int sum = num1 + num2;
                    
                     JOptionPane.showMessageDialog(frame, "sum"+sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid integers!");
                }
            }
        });

        frame.setVisible(true);
    }
}
