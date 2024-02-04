package Labs.Clark_Lab01_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class arrayFunctions {
        public static void main(String [] args) {
            int [] list = { 23, 45, 32, 65, 22, 99, 1 };
            ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(23,45,32,65,22,99,1));
            int min = list[0];
            int max = list[0];
            int total = 0;
            // Adds the total of the array, finds the min value, and finds the max value
            for(int item : list){
                total+=item;
                if(min > item){
                    min = item;
                }
                if(max < item){
                    max = item;
                }
            }
            // Gets the average of the the array
            int avg = total/list.length;
            // Prints the min, max, and average of the 'list' array
            System.out.println("The min number from array is: " + min);
            System.out.println("The max number from array is: " + max);
            System.out.println("The average from array is: " + avg);
            // Prints the min, max, and average of the 'arrList' array
            System.out.println("The min number from array list is: " + Collections.min(arrList));
            System.out.println("The max number from array list is: " + Collections.max(arrList));
            System.out.println("The average from array list is: " + ((IntStream.of(list).sum()) / arrList.size()));
        }   
}