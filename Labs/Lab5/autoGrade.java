package Labs.Lab5;
import java.util.Scanner;
public class autoGrade {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your grade: ");
        int userGrade = reader.nextInt();
        reader.close();
        String letterGrade = "";
        String letterGradeType = "";
        // Determines the letter grade of a student (A,B,C,D,F)
        if (userGrade >= 90){
            letterGrade = "A";
        }else if(userGrade >= 80){
            letterGrade = "B";
        }else if(userGrade >= 70){
            letterGrade = "C";
        }else if(userGrade >= 60){
            letterGrade = "D";
        }else{
            letterGrade = "F";
        }
        // Determins if the letter is a plus minus or none type
        // 0-4 = minus 5 = nothing 6-9 = plus
        // If the grade is 100 give a plus
        if (userGrade != 100){
            if((userGrade % 10) <= 4){
                letterGradeType = "-";
            }else if((userGrade % 10) >= 6){
                letterGradeType = "+";
            }
        }else{
            letterGradeType = "+";
        }
        System.out.println("You have a " + letterGrade + letterGradeType + " in the class.");
    }
}
