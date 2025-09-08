import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class lables {
    public static void main(String[] args){

        //  JLabel = a gui display area for a string og text,an image or both.
        JLabel label = new JLabel();    // creats a lable 
        label.setText("hello how are you.");  // set text to lable 

        ImageIcon imgicon = new ImageIcon("gd5Fe1QL30akj8m.png");
        Border border = BorderFactory.createLineBorder(Color.CYAN,3);
        label.setIcon(imgicon);
        label.setHorizontalTextPosition(JLabel.CENTER);     // set text left center right of image.
        label.setVerticalTextPosition(JLabel.BOTTOM);       // set text top center bottom of image.
        label.setForeground(Color.orange);
        label.setFont(new Font("My Boli",Font.BOLD,30));
        label.setIconTextGap(-10);  // sets gap between image and icon.
        label.setBackground(new Color(0x123456));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);    // set vertical component of icon +text withing lable 
        label.setHorizontalAlignment(JLabel.CENTER);  // set horizontal component of icon +text withing lable 
        //label.setBounds(100,-100,500,1000/2); // set x,y position within frames as well as dimentions 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        JFrame frame = new JFrame();   // this creates a frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of applicatioon 
        frame.setVisible(true);      // this makes the frame visible 
        frame.setResizable(true);
        frame.setSize(2460,1080);
        frame.setTitle("jFrame title yaha lagta h.");
        //frame.setLayout(null);
        frame.add(label);
        
        ImageIcon image = new ImageIcon("gd5Fe1QL30akj8m.png");  // creating an image icon
        frame.setIconImage(image.getImage());      //change icon of image
        //frame.getContentPane().setBackground(new Color(0,0,0));  // changes color in back ground 
        frame.pack();
    }
    
}
