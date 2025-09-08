
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyframeKeybordlistner extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;


     MyframeKeybordlistner() {

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("dalo jo likhe ho");
        button.addActionListener(this);


        JTextField textField= new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        
        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println(textField.getText());

        }


    }

 
    
}
