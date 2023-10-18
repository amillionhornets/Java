package projects.project1;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the coolest calculator known to man!\n");
        System.out.print("Please input your first number: ");
        Float firstNum = (float)reader.nextFloat();
        System.out.print("Please input your Second number: ");
        Float secondNum = reader.nextFloat();
        reader.close();
        System.out.println("ADD: " + firstNum + "+ " + secondNum + " = " + (firstNum + secondNum));
        System.out.println("SUBTRACT: " + firstNum + " - " + secondNum + " = "  + (firstNum - secondNum));
        System.out.println("MULTIPLY: "  + firstNum + " * " + secondNum + " = "  + (firstNum * secondNum));
        System.out.println("DIVIDE: " + firstNum + " / " + secondNum + " = "  + (firstNum / secondNum));
        System.out.println("MODULUS: " + firstNum + " % " + secondNum + " = "  + (firstNum % secondNum));
        System.out.println("SQUARE FIRST NUMBER: "+ firstNum + "^2 = "  + (firstNum*firstNum));
        System.out.println("SQUARE SECOND NUMBER: " + secondNum + "^2 = " + (secondNum*secondNum));
        System.out.println("SPECIAL FORMULA => ("+ firstNum + "*" + secondNum + ")/2 = " + ((firstNum*secondNum)/2));
    }
}
