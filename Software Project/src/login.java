import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame{
    private JLabel loginTitle;
    private JTextField loginEnterUsername;
    private JPasswordField loginEnterPassword;
    private JLabel loginEnterUsernameLabel;
    private JLabel loginEnterPasswordLabel;
    private JButton loginButton;
    private JButton loginClose;
    private JPanel rootPanel;
    private JButton loginBackButton;
    private JLabel errorLabel;
    public user registeredUser = new user();

    public login(){
        add(rootPanel);
        setTitle("Login");
        setSize(400, 500);

        //Used to alert the user that there was a failure in logging in
        errorLabel.setVisible(false);

        //Allows user to close application
        loginClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //allows user to backtrack to previous page
        loginBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new home().setVisible(true);
            }
        });
        //Allows user to log in
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //take the input from the user from the fields
                registeredUser.username = loginEnterUsername.getText();
                registeredUser.password = loginEnterPassword.getPassword();
                String[] fileDetails = new String[]{
                        "RegisteredUser"+registeredUser.username,
                        registeredUser.username,
                        new String(registeredUser.password)
                };
                //compare user input to files in directory to validate if they exist
                ReadFile readFile = new ReadFile();
                if(readFile.main(fileDetails)){
                    dispose();
                    new dashboard().setVisible(true);
                }
                else{
                    errorLabel.setVisible(true);
                }

            }
        });
    }

}
