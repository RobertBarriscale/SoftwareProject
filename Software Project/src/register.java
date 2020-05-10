import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class register extends JFrame {
    private JPanel rootPanel;
    private JLabel titleLabel;
    private JTextField registerUsernameField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JPasswordField registerPasswordField;
    private JButton registerEnter;
    public user registerUser = new user();
    private JButton closeApplication;
    private JButton registerBackButton;

    public register(){

        add(rootPanel);
        setTitle("Register");
        setSize(400, 500);

        //Handles closing the application from the close button
        closeApplication.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //This button allows the user to go back to the previous page
        registerBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //dispose is used to remove a window that is no longer needed
                dispose();
                //opens the new window
                new home().setVisible(true);
            }
        });

        //This button triggers the application to create a txt file and store the user's inputs from the fields
        registerEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //these handle taking the input from the fields
                registerUser.username = registerUsernameField.getText();
                registerUser.password = registerPasswordField.getPassword();
                //tells the application that these are Strings to make it easier to store them in the next file
                String[] fileDetails = new String[]{
                        "RegisteredUser"+registerUser.username,
                        registerUser.username,
                        //convert the char[] to string
                        new String(registerUser.password)
                };
                //calls the CreateFile/WriteFile classes to work
                CreateFile createFile = new CreateFile();
                WriteFile writeFile = new WriteFile();
                createFile.main(fileDetails);
                writeFile.main(fileDetails);
                System.out.println("Registered: "+registerUser.username);
            }
        });

        registerEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new preferences().setVisible(true);
            }
        });
    }

}
