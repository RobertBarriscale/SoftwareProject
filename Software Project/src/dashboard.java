import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame{
    private JPanel rootPanel;
    private JLabel welcomeLabel;
    private JList articlesList;
    private JButton dashClose;
    private JButton dashPreferences;

    public dashboard(){

        add(rootPanel);
        setTitle("MyNews Dashboard");
        setSize(600, 800);


        dashClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        dashPreferences.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new preferences().setVisible(true);
            }
        });
    }

}
