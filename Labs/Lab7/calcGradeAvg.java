package Labs.Lab7;
import java.util.Scanner;

// This program calculates the highest, lowest, and average of an amount of grades a user enters.
public class calcGradeAvg {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many grades do you want to enter: ");
        int userGradesTotal = reader.nextInt();
        int grades[] = new int[userGradesTotal];
        for(int index = 0; index < userGradesTotal; index++){
            System.out.print("Grade " + (index + 1) + ": " );
            grades[index] = reader.nextInt();
            System.out.print("\n" );
        }
        reader.close();
        System.out.println("Highest Grade: " + highestGrade(grades));
        System.out.println("Lowest Grade: " + lowestGrade(grades));
        System.out.println("Grade Average: " + average(grades));

    }
    // Loops through the grades and returns the highest value.
    public static int highestGrade(int grades[]){
        int largestNum = 0;
        for(int grade : grades){
            if(largestNum < grade){
                largestNum = grade;
            }
        }
        return largestNum;
    }
    // Loops through the grades and returns the lowest value.
    public static int lowestGrade(int grades[]){
        int smallestGrade = 1000000000;
        for(int grade : grades){
            if(smallestGrade > grade){
                smallestGrade = grade;
            }
        }
        return smallestGrade;
    }
    // Returns the average of the grades.
    public static int average(int grades[]){
        int sum = 0;
        for(int grade : grades){
            sum+=grade;
        }
        
        return sum/grades.length;
    }
}
