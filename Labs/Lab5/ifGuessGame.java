package Labs.Lab5;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class ifGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int userNum = reader.nextInt();
        reader.close();
        int difference = Math.abs(userNum - randNum);
        System.out.println("You picked: " + userNum);
        System.out.println("The number was: " + randNum);
        System.out.println("The difference was: " + difference);
        if(difference == 0){
            System.out.println("Your score: 100");
        }else if(difference > 0 && difference < 25){
            System.out.println("Your score: 50");
        }else  if(difference >= 25){
            System.out.println("Your score: 0");
        }
    }
}
