package control;

import entity.DataBase;
import javax.swing.JOptionPane;

public class Control { // apply loginInterface

    private boolean isValidUser;
    private String username, password, userType;

    private Control(String username, String password, boolean isValidUser) {
        this.username = username;
        this.password = password;
        this.isValidUser = isValidUser;
    }

    public Control(String username, String password) {
        // transfer 2 Strings to private Control object
        Control cControl = new Control(username, password, false);
        // compare 2 passwords
        isValidUser = cControl.comparePasswords(cControl.username);
        
        // final report
        JOptionPane.showMessageDialog(null, "After login the value of boolean isValidUser = " + isValidUser, null, 1);
    }

    private boolean comparePasswords(String username) {
        // set isValidUser
        DataBase db = new DataBase(username);
        String dbPassword = db.getPassword(username);
        if (dbPassword != null) {
            if (dbPassword.equals(password)) {
                userType = db.getUserType(username);
                if (userType.equals("Manager"))
                        {
                            // create ManagerMethods object
                            // this invokes its constructor
                            // which we can use
                        }
                return true;
            }
        }
        return false;
    }
}
