package Labs.Lab7;
import java.util.Scanner;
public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many elements of the Fibonacci series do you want to print?: ");
        int userFibLen = reader.nextInt();
        reader.close();
        int previousNum = 0;
        int currentNum = 1;
        int newNum = 0;
        System.out.print(previousNum + " ");
        for(int index = 1; index < userFibLen; index++){
            System.out.print(currentNum + " ");
            newNum = previousNum + currentNum;
            previousNum = currentNum;
            currentNum = newNum;
        }
    }   
}
