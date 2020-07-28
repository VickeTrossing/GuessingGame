public class User {
    private int score;
    static User instance = new User();

    public User(int score){
        this.score = score;
    }

    public User(){
        this(0);
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public static User getInstance(){
        return instance;
    }
}
