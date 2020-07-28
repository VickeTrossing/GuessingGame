

import java.util.Random;
import java.util.Scanner;

public class Math {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    private int yourGuess = 101;
    Highscore hs = Highscore.getInstance();
    User refUser = User.getInstance();


    public void guess(){

            Menu menu = new Menu();
            int guessNumber = rand.nextInt(9)+1;
            int yourScore = 100;


            while(yourGuess != guessNumber){

                System.out.println(guessNumber);
                System.out.print("Guess the number! Type your guess here: ");
                yourGuess = scan.nextInt();

                if(yourGuess == guessNumber){
                    //refUser.setScore(yourScore);
                    System.out.println("You guessed right! Your score is: " + yourScore);

                    if(hs.highscoreList.size() == 0){
                        hs.highscoreList.add(yourScore);
                    }
                    else if(yourScore > hs.highscoreList.get(0)){
                        System.out.println("Thats a new highscore!");
                        hs.highscoreList.add(0, yourScore);
                    }
                    else{
                        for (int i = 0; i < hs.highscoreList.size(); i++){
                            if(yourScore >= hs.highscoreList.get(i)){
                                hs.highscoreList.add(i, yourScore);
                                break;
                            }
                        }
                    }
                    menu.menu();

                }
                else if(yourGuess < guessNumber){
                    System.out.println("Wrong! The number is bigger than your guess. Your score is " + (yourScore -= 5));
                }
                else if(yourGuess > guessNumber){
                    System.out.println("Wrong! The number is smaller than yor guess. Your score is: " + (yourScore -= 5));
                }
        }
    }
}
