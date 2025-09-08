
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class JOptionPan {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"hello my name is nisidh.","practice",JOptionPane.PLAIN_MESSAGE);
        // System.out.println(JOptionPane.showConfirmDialog(null,"are you gay?","Gay checker",JOptionPane.YES_NO_CANCEL_OPTION));
        // int answer = JOptionPane.showConfirmDialog(null,"are you gay?","Gay checker",JOptionPane.YES_NO_CANCEL_OPTION);
        // JOptionPane.showInputDialog("hey gay whats you name? ");
        ImageIcon icon = new ImageIcon("gd5Fe1QL30akj8m.png");
        String[] optionButton = new String[3];
        optionButton[0]="ha";
        optionButton[1]="han mai hi ggay hun";
        optionButton[2]="mere alawa koi gay ho hin nahi sakta";

        
        JOptionPane.showOptionDialog(null, "are you gay?", "gay checker", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, optionButton, null);  



    }
    
}
