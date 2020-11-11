import java.util.Scanner;
public class Game extends Player {
    Scanner player = new Scanner(System.in);
    public Game() {
        System.out.print("ENTER LOGIN NAME: ");
        setName(player.next());
        System.out.println(name+" "+ "WELCOME TO SECRETWORD GAME!!");   
        System.out.println("CHOOSE DIFFICULTY\nPress 1 for easy\tPress 2 for medium\tPress 3 for difficult");
        int choise=player.nextInt();
//        if(choise==1){      //analogws thn epilogh -> megethos tamplo
//            new Tablo5();
//        }else if(choise==2){
//            new Tablo8();
//        }else if(choise==3){
//            new Tablo10();
//        }
        
    }
}
