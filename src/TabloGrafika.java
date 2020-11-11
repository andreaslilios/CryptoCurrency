
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class TabloGrafika extends JPanel {

    private JPanel row[];
    private JPanel col2;
    private int choice;
    private char choice2;
    private char[][] Chars;
    private JButton[][] LButtons;

    private Color color;

    TabloGrafika(int size) throws IOException {

        LButtons = new JButton[size][size];
        row = new JPanel[size];
        //dhmiourgw to JFrame
        JFrame frame1 = new JFrame("Κρυπτόλεξο");       // H ETIKETA TOY MENU
        frame1.setSize(500, 500);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      // KLEISIMO ME TO X

        //Sto prwto JPanel tha exw to tablo tou paixnidiou
        Container pane = frame1.getContentPane();
        pane.setPreferredSize(new Dimension(200, 200));

        GridLayout grid = new GridLayout(size, 2);
        pane.setLayout(grid);

        grid.preferredLayoutSize(pane);

        grid.preferredLayoutSize(pane);

        FlowLayout flowlayout = new FlowLayout();

        Tablo tablo = new Tablo(size);
// EPILOGH LEJEWN APO ARXEIO 
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
//            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
             tablo.lekseis(selectedFile.getAbsolutePath());
        }
        
        // EDW GINETAI TO PANTREMA THS 1HS ME THS 2HS FASHS OPOY EXOYME EISAGWGH GRAMMATWN KAI SHUFFLE
        tablo.gemisma();
        tablo.shuffle(tablo.board);
//        tablo.printer();
        col2 = new JPanel();
        col2.setLayout(grid);
        //topothetish twn koympiwn sto frame me tetoio tropo wste na sxhmatizoyn to tablo tou paixnidiou
        for (int i = 0; i < size; i++) {
            row[i] = new JPanel();
            row[i].setLayout(grid);
            for (int j = 0; j < size; j++) {
                LButtons[i][j] = new JButton(tablo.board[i][j] + "");
                LButtons[i][j].setPreferredSize(new Dimension(2, 2));

                pane.add(LButtons[i][j]);

                row[i].setSize(100, 100);

                pane.add(row[i]);
                // pane.add(col2);

            }
        }
        pane.revalidate();
        pane.repaint();
    }
}
