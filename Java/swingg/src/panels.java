import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panels {
    public static void main(String[] args) {
    ImageIcon imageicon = new ImageIcon("gd5Fe1QL30akj8m.png");
    
    JPanel redpanel = new JPanel();
    redpanel.setBackground(Color.RED);
    redpanel.setBounds(0,100,1000,25*3);

    JLabel lable = new JLabel();
    lable.setIcon(imageicon);
    lable.setText("Shopping app");

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setSize(1000, 800);
        frame.setLayout(null);
        frame.add(redpanel);
        redpanel.add(lable);
        
    }
    
}
