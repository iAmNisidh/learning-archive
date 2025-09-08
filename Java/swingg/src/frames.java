

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class frames {

    public static void main(String[] args){
        JFrame frame = new JFrame();   // this creates a frame 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of applicatioon 
        frame.setVisible(true);      // this makes the frame visible 
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setTitle("jFrame title yaha lagta h.");

        ImageIcon image = new ImageIcon("gd5Fe1QL30akj8m.png");  // creating an image icon
        frame.setIconImage(image.getImage());      //change icon of image
        frame.getContentPane().setBackground(new Color(0,0,0));  // changes color in back ground 

    }   
    
}
