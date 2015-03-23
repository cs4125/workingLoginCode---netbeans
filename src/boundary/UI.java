package boundary;

import control.Control;
import javax.swing.JOptionPane;

public class UI {
    
    public String username, password;
    
    UI (String username, String password) {
        this.username = "Jim";
        this.password = "123";
    }

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "jim 123 = Manager\npat 456 = Receptionist\njoe 789 = Guest", null, 1);
        
        String username= JOptionPane.showInputDialog("username: ");
        String password= JOptionPane.showInputDialog("password: ");
        
        // call public Control constructor
        Control bControl;
        
        // login passed to Control constructor
        bControl = new Control(username, password);

        // no more references to bControl => deconstructed
    }
    
}
