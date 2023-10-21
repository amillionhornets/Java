package projects.project2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class improvedCalculator{
    public static void main(String[] args) {
        System.out.println("Welcome to the coolest calculator known to man!");
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float userNum1 = reader.nextFloat();
        reader.nextLine();
        while(true){
            // Prints out a menu of actions and checks to make 
            // sure the action is in the menu.
            String userAction = "";
            Float total = null;
            String[] actions = {"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULUS", "E"};
            List<String> actionList = Arrays.asList(actions);
            while (!(actionList.contains(userAction))) {
                System.out.print("MENU: \n  ADD, +\n  SUBTRACT,-\n  MULTIPLY, *\n DIVIDE, /\n  MODULUS, %\n  EXIT, E\n");
                System.out.print("Enter an Action: ");
                userAction = reader.nextLine();
            }
            // If the user action is 'E' closes the program.
            if (userAction.equals("E")){
                reader.close();
                System.out.println("Thank you for using the coolest calculator known to man!");
                System.exit(0);
            }
            System.out.print("Enter a number: ");
            float userNum2 = reader.nextFloat();
            reader.nextLine();
            // Uses the user's action and numbers to perform calculations
            if(userAction.equals("ADD")){
                total = addition(userNum1, userNum2);
                System.out.println("Total = " + total);
            }else if (userAction.equals("SUBTRACT")){
                total = subtraction(userNum1, userNum2);
                System.out.println("Total = " + total);
            }else if (userAction.equals("MULTIPLY")){
                total = multiplication(userNum1, userNum2);
                System.out.println("Total = " + total);
            }else if (userAction.equals("DIVIDE")){
                total = division(userNum1, userNum2);
                System.out.println("Total = " + total);
            }else if (userAction.equals("MODULUS")){
                total = mod(userNum1, userNum2);
                System.out.println("Total = " + total);
            }
            userNum1 = total;
        }
    }
    // Adds two numbers
    public static float addition(float num1, float num2){
        return num1 + num2;
    }
    // Subtracts two numbers
    public static float subtraction(float num1, float num2){
        return num1 - num2;
    }
    // Multiplys two numbers
    public static float multiplication(float num1, float num2){
        return num1 * num2;
    }
    // Divides two numbers
    public static float division(float num1, float num2){
        return num1 / num2;
    }
    // Mods two numbers
    public static float mod(float num1, float num2){
        return num1 % num2;
    }
}