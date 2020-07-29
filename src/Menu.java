import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    public void menu(){


        System.out.println("Welcome to the guessing game!\n1. Start game\n2. Highscore");
        System.out.print("What do you choose?: ");
        int choice = scan.nextInt();

        switch (choice){
            case 1:
                Math game = new Math();
                game.guess();
                break;
            case 2:
                Highscore hs = Highscore.getInstance();
                hs.checkHighScore();
                break;
            default:
                System.out.println("Wrong input.");
                break;
        }
    }
}
