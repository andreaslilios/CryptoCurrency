
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tablo {

    public static char[][] board;
    protected static int N;
    protected static int points;
    private Player player;
    protected static Letters gramma;

    public Tablo(int N) {
        this.N = N;
        board = new char[N][N];     // to tamplo mas
        gramma = new Letters();     // typou LETTERS

    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public void setN(int N) {
        this.N = N;
    }

    public char[][] getBoard() {
        return board;
    }

    public int getN() {
        return N;
    }

    public static ArrayList<String> words = new ArrayList();

    public void lekseis(String path) throws FileNotFoundException, IOException { //lista me tis lekseis gia peirama
//PLEON KAI GIA TO ARXEIO LEKSEWN
        BufferedReader in = new BufferedReader(new FileReader(path));
        String line;
        while ((line = in.readLine()) != null) {
            words.add(line);
        }
        in.close();
//        words.add("ΠΟΤΑΜΙ");
//        words.add("ΚΑΡΕΚΛΑ");
//        words.add("ΠΟΡΤΑ");
//        words.add("ΜΑΘΗΜΑ");
//        words.add("ΑΜΑΞΙ");
//        words.add("ΚΟΥΚΛΑ");
//        words.add("ΦΩΤΙΑ");
//        words.add("ΣΠΙΡΤΟ");
//        words.add("ΧΡΟΝΟΣ");
//        words.add("ΜΥΤΗ");
//        words.add("ΣΚΟΥΛΙΚΙ");
//        words.add("ΚΑΠΝΟΣ");
    }

    public void gemisma() {     //gemizw to tamplo me tis lekseis
        Integer a = this.N * this.N, x = 0, y = 0;
        for (int i = 0; i < this.words.size(); i++) {//gia kathe leksh
            if (this.words.get(i).length() <= a) {  //an xwraei
                a -= this.words.get(i).length();
                for (int j = 0; j < this.words.get(i).length(); j++) { //gia kathe char tis lekshs
                    this.board[x][y] = this.words.get(i).charAt(j);

                    System.out.print(" [" + x + "][" + y + "]=" + this.words.get(i).charAt(j));
                    //0,0
                    y++;
                    //0,1
                    if (y == this.N) { //0,4
                        x++;
                        y = 0; //1,0
                        System.out.println("");
                    }
                }
            }
        }
        Random rand = new Random();

        if (a > 0) {    //diladi an exw kena koutia sto tamplo
            for (int i = 0; i < a; i++) {   // UPOLOIPA GRAMMATA x,y
                this.board[x][y] = Letters.gr.get(rand.nextInt(23));
                System.out.print(" [" + x + "][" + y + "]=" + this.board[x][y]);
                y++;
                if (y == this.N) {
                    x++;
                    y = 0;
                    System.out.println("");
                }
            }
        }
    }

//    public void anakatema() {    //anadiataksi tou tamplo
//        List list = new ArrayList();
//        for (char[] array : this.board) {
//            //This will add int[] object into the list, and not the int values.
//            list.add(Arrays.asList(array));
//        }
//        Collections.shuffle(Arrays.asList(this.board));
//    }

    public void shuffle(char[][] a) {
        Random random = new Random();

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = a[i].length - 1; j > 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                char temp = a[i][j];
                a[i][j] = a[m][n];
                a[m][n] = temp;
            }
        }
    }

    public void printer() {  //emfanisi
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "\t");
                if (j == this.N - 1) {
                    System.out.println();
                }
            }
        }
    }

    /* private void PlayerPoints(int sum) {//ananewsh twn pontwn tou paikth me to neo sum        
     this.player.setSum(this.player.getSum() + sum);
     } */
}
