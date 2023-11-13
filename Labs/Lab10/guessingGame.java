package Labs.Lab10;
import java.util.Scanner;
import Guess;
public class guessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Pick a number between 1 and 100: ");
        int userNum = reader.nextInt();
        Guess newGame = new Guess(); 
        System.out.println(newGame.getNumber());
        System.out.println(newGame.getNumber());
        System.out.println(newGame.getNumber());
    }
}