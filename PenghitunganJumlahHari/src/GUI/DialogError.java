
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DialogError {
    public static void digitFilter(KeyEvent evt){
        char input = evt.getKeyChar();
        if (!((Character.isDigit(input)) || 
        (input == KeyEvent.VK_BACK_SPACE) ||
        (input == KeyEvent.VK_DELETE))){
        
        new JFrame().getToolkit().beep();
        JOptionPane.showMessageDialog(null, "Error, Wajib Ketikkan Angka!");
        evt.consume();
        
    }
    }
    
}
