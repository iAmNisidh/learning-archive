import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements  ActionListener {

    JButton button;
    MyFrame(){

        button = new JButton();
        button.setBounds(200,100,100,75);
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(rootPaneCheckingEnabled);
        this.setShape(null);
        this.setSize(500,500);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e)
{
        if (e.getSource()==button){
            System.out.println("poop");
        }
    }

}
