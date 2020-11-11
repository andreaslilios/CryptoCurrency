
import java.util.ArrayList;
import java.util.HashMap;

public class Letters {

    protected int points;
    protected char letter;
    protected static HashMap<Character, Integer> letters;   
    public static ArrayList<Character> gr;               

    public Letters() {
        
        letters = new HashMap<Character, Integer>();
        gr = new ArrayList<Character>();
        points();   // oi vathmoi/gramma
        greek();    // mono ta 24 grammata


    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public char getLetter() {
        return letter;
    }

    public void points() {

        this.letters.put('A', 1);
        this.letters.put('Β', 8);
        this.letters.put('Γ', 4);
        this.letters.put('Δ', 4);
        this.letters.put('Ε', 1);
        this.letters.put('Ζ', 8);
        this.letters.put('Η', 1);
        this.letters.put('Θ', 8);
        this.letters.put('Ι', 1);
        this.letters.put('Κ', 2);
        this.letters.put('Λ', 3);
        this.letters.put('Μ', 3);
        this.letters.put('Ν', 1);
        this.letters.put('Ξ', 10);
        this.letters.put('Ο', 1);
        this.letters.put('Π', 2);
        this.letters.put('Ρ', 2);
        this.letters.put('Σ', 1);
        this.letters.put('Τ', 1);
        this.letters.put('Υ', 2);
        this.letters.put('Φ', 8);
        this.letters.put('Χ', 10);
        this.letters.put('Ψ', 10);
        this.letters.put('Ω', 3);

    }

    public void greek() {

        this.gr.add('A');
        this.gr.add('Β');
        this.gr.add('Γ');
        this.gr.add('Δ');
        this.gr.add('Ε');
        this.gr.add('Ζ');
        this.gr.add('Η');
        this.gr.add('Θ');
        this.gr.add('Ι');
        this.gr.add('Κ');
        this.gr.add('Λ');
        this.gr.add('Μ');
        this.gr.add('Ν');
        this.gr.add('Ξ');
        this.gr.add('Ο');
        this.gr.add('Π');
        this.gr.add('Ρ');
        this.gr.add('Σ');
        this.gr.add('Τ');
        this.gr.add('Υ');
        this.gr.add('Φ');
        this.gr.add('Χ');
        this.gr.add('Ψ');
        this.gr.add('Ω');

    }

}
