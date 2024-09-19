package Homework_1.files;

import java.util.Scanner;
public class ThreeClark {
    public static void main(String[] args) {
        // Read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int userNum = Integer.valueOf(scanner.next());
        scanner.close();
        boolean[] fullArray = new boolean[userNum];
        double startTime = System.nanoTime () ; // Start time in nano seconds
        erathosones(fullArray, userNum);
        printLastFive(fullArray);
        double duration = System.nanoTime() - startTime ; // End time subtracted from start time
        System.out.println("Duration: " + duration/Math.pow(10,9));
    }
    public static void erathosones(boolean[] fullArray, int sieveNum){
        for (int i = 2; i*i < Math.sqrt(fullArray.length); i++) { // Start i at two since the sieve starts at 2 
            for (int j = i*i; j < fullArray.length; j+=i) {       // we can always start marking primes at i^2 so we get i*i
                fullArray[j] = true;                              // Switch all composite nums to true
            }                                                     
        }
        // return fullArray[];
    }
    public static void printLastFive(boolean[] fullArray){
        int count = 0;
        for (int i = fullArray.length-1; count < 5; i--) { // Prints the last 5 prime numbers
            if(!fullArray[i]){
                System.err.println("");
                System.out.println(i);
                count++;
            }
            
        }
    }
}
