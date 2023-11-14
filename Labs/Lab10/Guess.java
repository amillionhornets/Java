package Labs.Lab10;
import java.util.Random;
public class Guess {
    // Creates a private variable and generates a random between 1 and 100
    private static int randomNumber = generateRandomNumber();
    private static int generateRandomNumber(){
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        return randNum;
    }
    // Getter for the random number
    public static int getNumber(){
        return randomNumber;
    }
    // Finds the difference between the user's num and the random num 
    // and calculates the score based on that
    public static int compare(int userNum){
        int difference = getNumber() - userNum;
        int score = 0;
        if(difference == 0){
            score = 100;
        }else if (difference > 0 && difference <= 25){
            score = 50;
        }else{
            score = 10;
        }
        return score;
    }
}
