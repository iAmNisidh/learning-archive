import javax.swing.*;
import java.awt.event.*;

public class loginpage {

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Username Label and Field
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        frame.add(userText);

        // Password Label and Field
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 50, 80, 25);
        frame.add(passLabel);

        JPasswordField passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        frame.add(passText);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 90, 80, 25);
        frame.add(loginButton);

        // Button action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                // Very basic validation
                if(username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials");
                }
            }
        });

        frame.setVisible(true);
    }
}
