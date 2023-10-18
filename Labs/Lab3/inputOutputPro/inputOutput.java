package Labs.Lab3.inputOutputPro;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your first name?: ");
        String fname = reader.nextLine();
        System.out.println("What is your last name?: ");
        String lname = reader.nextLine();
        System.out.println("What grade do you want in this class?: ");
        String grade = reader.nextLine();
        reader.close();
        System.out.println("My name is " + fname + " " + lname + " and I want a/an " + grade + " in this class!");
    }
}