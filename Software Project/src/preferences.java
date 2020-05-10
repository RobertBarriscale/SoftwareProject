import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class preferences extends JFrame {
    private JPanel rootPanel;
    private JLabel prefTitle;
    private JButton prefBackButton;
    private JButton prefClose;
    private JButton prefAcceptButton;
    private JCheckBox choiceMusic;
    private JCheckBox choiceMovies;
    private JCheckBox choiceSports;
    private JCheckBox choicePolitics;
    private JCheckBox choiceLifestyle;
    private JCheckBox choiceHealth;
    private JCheckBox choiceGaming;
    private JCheckBox choiceTechnology;
    private JCheckBox choiceFashion;
    public newspreferences userPreferences = new newspreferences();

    public preferences(){

        add(rootPanel);
        setTitle("Preferences");
        setSize(400, 500);


        //allow user to close application
        prefClose.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //allow user to backtrack to previous page
        prefBackButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new home().setVisible(true);
            }
        });
        //take the checked input from the user
        prefAcceptButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userPreferences.music = choiceMusic.isSelected();
                userPreferences.movies = choiceMovies.isSelected();
                userPreferences.sports = choiceSports.isSelected();
                userPreferences.technology = choiceTechnology.isSelected();
                userPreferences.health = choiceHealth.isSelected();
                userPreferences.fashion = choiceFashion.isSelected();
                userPreferences.gaming = choiceGaming.isSelected();
                userPreferences.lifestyle = choiceLifestyle.isSelected();
                userPreferences.politics = choicePolitics.isSelected();
                dispose();
                new dashboard().setVisible(true);
            }
        });
    }

}
