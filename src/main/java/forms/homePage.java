package forms;
import java.io.File;
import javax.swing.*;

public class homePage extends JFrame {
    private JPanel homePage;
    private JPanel navigationPanel;
    private JPanel cardPanel;
    private JLabel card;
    private JLabel cardLabel;
    private JLabel card2Label;
    private JLabel card3Label;
    private JLabel card4Label;
    private JLabel card5Label;
    private JLabel card6Label;
    private JLabel card7Label;
    private JLabel card8Label;
    private JLabel card9Label;
    private JButton readMoreButton;
    private JButton readMoreButton2;
    private JButton readMoreButton3;
    private JButton readMoreButton4;
    private JButton readMoreButton5;
    private JButton readMoreButton6;
    private JButton readMoreButton7;
    private JButton readMoreButton8;
    private JButton readMoreButton9;
    private JLabel logoLabel;
    private JButton myListingsButton;
    private JButton signOutButton;
    private JLabel img;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JLabel img5;
    private JLabel img6;
    private JLabel img7;
    private JLabel img8;
    private JLabel img9;

    JButton[] button = new JButton[] { readMoreButton, readMoreButton2, readMoreButton3, readMoreButton4, readMoreButton5, readMoreButton6, readMoreButton7, readMoreButton8, readMoreButton9};


    public homePage() {
        setContentPane(homePage);
        setTitle("rentyourcar.no");
        setSize(1200, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //for loop for å kunne fylle tekst inne i alle knappene for hver bil
        //endre i>8 med i>lengden på listen
        for (int i = 0; i < 8; i++) {
            button[i].setText("Bestill");
        }

    }

    public static void main(String[] args) {
        homePage myFrame = new homePage();
    }


    private void createUIComponents() {
        img = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img2 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img3 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img4 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img5 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img6 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img7 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img8 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
        img9 = new JLabel(new ImageIcon("/Users/hamodi-284/Desktop/bilutleie/images/bil.jpg"));
    }

}