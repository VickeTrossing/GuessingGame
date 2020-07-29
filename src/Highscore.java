import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Highscore {

    static Highscore instance = new Highscore();
    ArrayList<Integer> highscoreList = new ArrayList<>();
    Menu menu = new Menu();

    public static Highscore getInstance(){
        return instance;
    }

    void createHighscoreList() {

    }

    public void checkHighScore(){
        int place = 1;
        System.out.println("HIGH SCORES: ");

        if(highscoreList.size() == 0){
            System.out.println("No highscores yet!");
        }

        for (Integer integer : highscoreList) {
            System.out.println(place + ". " + integer);
            place++;
        }
        menu.menu();
    }
}
