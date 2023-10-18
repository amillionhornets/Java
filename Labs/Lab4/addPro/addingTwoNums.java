package Labs.Lab4.addPro;
import java.util.Scanner;

public class addingTwoNums {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        Byte firstNum = reader.nextByte();
        System.out.print("Enter the second number: ");
        Byte secondNum = reader.nextByte();
        reader.close();
        int total = firstNum + secondNum;
        System.out.println(firstNum + " + " + secondNum + " added together equals " + total);
    }
}
