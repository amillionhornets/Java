package Labs.Lab4.randomGuessingGame;
import java.util.Random;
import java.util.Scanner;

public class game1 {
    public static void main(String[] args){
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int userNum = reader.nextInt();
        System.out.println("You picked: " + userNum);
        System.out.println("The number was: " + randNum);
        System.out.println("You were " + (randNum - userNum) + " numbers off!");
        reader.close();
    }
}
