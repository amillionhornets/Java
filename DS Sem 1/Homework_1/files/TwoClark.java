package Homework_1.files;
import java.util.Scanner;
public class TwoClark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of N: ");
        int finalNum = Integer.valueOf(scanner.nextLine());
        scanner.close();
        int[] fibNums = new int[finalNum];
        if(finalNum > 2){
            fibNums[0] = 0;
            fibNums[1] = 1;
        }
        for(int i = 2;i < finalNum; i++){
           int nextNum = fibNums[i-2] + fibNums[i-1];
           fibNums[i] = nextNum;
        }
        printFibNums(fibNums,finalNum-1);
    }
    public static void printFibNums(int[] fibNums, int finalNum){
        String lastNumtoString = String.valueOf(fibNums[finalNum]);
        int tabAmount = lastNumtoString.length();
        for(int i = 0; i < finalNum; i++){
            int currentDigits = String.valueOf(fibNums[i]).length();
            int totalTabAmount = tabAmount-currentDigits-1;
            System.out.print(" ");
            for(int a = 0; a < totalTabAmount; a++){
                System.out.print(" ");
            }
            System.out.print(fibNums[i]);
        }
    }
}
