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
            /*
             * Prints out a menu of actions and checks to make sure the action is in the menu.
             */
            String userAction = "";
            String[] actions = {"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULUS", "E"};
            List<String> actionList = Arrays.asList(actions);
            while (!(actionList.contains(userAction))) {
                System.out.print("MENU: \n  ADD, +\n  SUBTRACT,-\n  MULTIPLY, *\n DIVIDE, /\n  MODULUS, %\n  EXIT, E\n");
                System.out.print("Enter an Action: ");
                userAction = reader.nextLine();
            }
            if (userAction.equals("E")){
                break;
            }
            System.out.print("Enter a number: ");
            float userNum2 = reader.nextFloat();
            reader.nextLine();
            if(userAction.equals("ADD")){
                System.out.println("Total = " + addition(userNum1, userNum2));
            }else if (userAction.equals("SUBTRACT")){
                System.out.println("Total = " + subtraction(userNum1, userNum2));
            }else if (userAction.equals("MULTIPLY")){
                System.out.println("Total = " + multiplication(userNum1, userNum2));
            }else if (userAction.equals("DIVIDE")){
                System.out.println("Total = " + division(userNum1, userNum2));
            }else if (userAction.equals("MODULUS")){
                System.out.println("Total = " + mod(userNum1, userNum2));
            }
            userNum1 = userNum2;
            
        }
        reader.close();
        System.out.println("Thank you for using the coolest calculator known to man!");
        System.exit(0);
    }
    public static float addition(float num1, float num2){
        return num1 + num2;
    }
    public static float subtraction(float num1, float num2){
        return num1 - num2;
    }
    public static float multiplication(float num1, float num2){
        return num1 * num2;
    }
    public static float division(float num1, float num2){
        return num1 / num2;
    }
    public static float mod(float num1, float num2){
        return num1 % num2;
    }
}