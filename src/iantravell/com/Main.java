package iantravell.com;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 100;
        int bonus = 5;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        calculateScore(true, 800, 5, 100);
        System.out.println("calculateScore method has executed");

        calculateScore(true, 10000, 8, 200);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=2000;


            return finalScore;
        }
            return -1;
    }


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        int highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Ian", highScorePosition);

        int highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        int highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Carl", highScorePosition);


    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }


    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }

    }
}
