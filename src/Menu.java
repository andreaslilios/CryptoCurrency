
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu extends JFrame {

    private JPanel panel1;

    public Menu() {
        super("Κρυπτόλεξο");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

        panel1 = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        
        //MENU ERGALEIA ME 6 ITEMS 

        JMenu Menu = new JMenu("Μενού");
        menuBar.add(Menu);

        JMenuItem option1 = new JMenuItem("Νέο Παιχνίδι");
        Menu.add(option1);

        JMenuItem option2 = new JMenuItem("Ακύρωση/Τερματισμός παιχνιδιού");
        Menu.add(option2);

        JMenuItem option3 = new JMenuItem("Εισαγωγή στοιχείων Παίκτη");
        Menu.add(option3);

        JMenuItem option4 = new JMenuItem("Ρυθμισεις Βοηθειών");
        Menu.add(option4);

        JMenuItem option5 = new JMenuItem("Αναζήτηση αρχείου λέξεων");
        Menu.add(option5);

        JMenuItem option6 = new JMenuItem("Έξοδος");
        Menu.add(option6);

        //MENU ERGALEIA ME 2 ITEMS 
        JMenu Menu2 = new JMenu("Εργαλεία");

        menuBar.add(Menu2);

        JMenuItem option7 = new JMenuItem("Βοήθεια");
        Menu2.add(option7);

        JMenuItem option8 = new JMenuItem("About Us");
        Menu2.add(option8);


        JLabel label11 = new JLabel("Welcome!");

        Container pane = getContentPane();

        FlowLayout flo = new FlowLayout();

        pane.setLayout(flo);

        setContentPane(pane);

        setJMenuBar(menuBar);

        ImageIcon image = new ImageIcon("Kryptolexo!.jpeg");

        JLabel label0 = new JLabel(image);

        label11.setFont(new Font("Serif", Font.PLAIN, 25));

        pane.add(label11);
        pane.add(label0);

        pack();

        setLocationRelativeTo(null);
// AKROATHS GIA TO NEO PAIXNIDI
        option1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //KLEINW PALIO PARATHYRO
                dispose();

                //NEO PARATHYRO
                JFrame frame2 = new JFrame("Κρυπτόλεξο");

                JPanel panel2 = new JPanel();

                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame2.setVisible(true);

                GridLayout flo = new GridLayout(5, 4);

                panel2.setLayout(flo);

                
                //LABELS GIA TO MEGETHOS TOY TABLO
                JLabel label1 = new JLabel("ΕΠΕΛΕΞΕ ΕΠΙΠΕΔΟ");
                JLabel label2 = new JLabel("     ");

                JButton tablo1 = new JButton("ΕΥΚΟΛΟ");
                JButton tablo2 = new JButton("ΚΑΝΟΝΙΚΟ");
                JButton tablo3 = new JButton("ΔΥΣΚΟΛΟ");

                panel2.add(label1);
                panel2.add(label2);
                panel2.add(tablo1);
                panel2.add(tablo2);
                panel2.add(tablo3);

                label1.setFont(new Font("Serif", Font.PLAIN, 20));

                frame2.add(panel2);

                frame2.setSize(600, 400);
                frame2.setLocationRelativeTo(null);

                // AKROATES GIA TA KOYMPIA TOY MEGETHOYS WSTE NA EMFANISTEI O PINAKAS
                tablo1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                        try {
                            new TabloGrafika(5);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                );
                tablo2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                        try {
                            new TabloGrafika(8);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                );
                tablo3.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                        try {
                            new TabloGrafika(10);
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                );
            }
        });
        // AKROATHS GIA STOIXEIA PAIKTH
        option3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              
                dispose();

               
                JFrame frame2 = new JFrame("Κρυπτόλεξο");

                JPanel panel2 = new JPanel();

                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame2.setVisible(true);

                GridLayout flo = new GridLayout(5, 4);

                panel2.setLayout(flo);

                
                JTextField t1 = new JTextField(30);
                JLabel labelq = new JLabel("ΟΝΟΜΑ ΠΑΙΚΤΗ");
                JLabel labelw = new JLabel("     ");
                
                 panel2.add(labelq);
                panel2.add(t1);

                labelq.setFont(new Font("Serif", Font.PLAIN, 20));

                frame2.add(panel2);

                frame2.setSize(400, 200);
                frame2.setLocationRelativeTo(null);

                
                String name=t1.getText();
                JButton user = new JButton("ADD"); panel2.add(user);
                panel2.add(user);
                

                user.setFont(new Font("Serif", Font.PLAIN, 20));

                frame2.add(panel2);

                frame2.setSize(400, 200);
                frame2.setLocationRelativeTo(null);
                
                
            }

    });
        
        
        
        
        // AKROATHS GIA STOIXEIA EPIKOINWNIAS
        option8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 
                dispose();

                
                JFrame frame2 = new JFrame("Κρυπτόλεξο");

                JPanel panel2 = new JPanel();

                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame2.setVisible(true);

                GridLayout flo = new GridLayout(5, 4);

                panel2.setLayout(flo);

                
                
                JLabel labelq = new JLabel("Lilios Andreas  icsd11085@icsd.aegean.gr");
                JLabel labelw = new JLabel("     ");
                JLabel labela = new JLabel("Baklagis Ilias  icsd11103@icsd.aegean.gr");
                JLabel labelb = new JLabel("     ");
                
                 panel2.add(labelq);
                 panel2.add(labelw);
                 panel2.add(labela);
                 panel2.add(labelb);
                

                labelq.setFont(new Font("Serif", Font.PLAIN, 20));
                labela.setFont(new Font("Serif", Font.PLAIN, 20));

                frame2.add(panel2);

                frame2.setSize(400, 200);
                frame2.setLocationRelativeTo(null);

                
                
            }

    });
}
}
