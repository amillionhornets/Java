package Labs.Lab10;
import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        // Opens the scanner and gets the user's input
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int userNum = reader.nextInt();
        reader.close();
        System.out.println("You picked: " + userNum);
        System.out.println("The number was: " + Guess.getNumber());
        System.out.println("Your score was " + Guess.compare(userNum));   
    }
}