import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame {
    private JLabel homeTitle;
    private JButton homeRegisterButton;
    private JButton homeLoginButton;
    private JButton homeCloseButton;
    private JPanel rootPanel;

    public home(){
        add(rootPanel);
        setTitle("MyNews");
        setSize(400, 500);


        homeCloseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        homeRegisterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new register().setVisible(true);
            }
        });
        homeLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new login().setVisible(true);
            }
        });
    }

}
