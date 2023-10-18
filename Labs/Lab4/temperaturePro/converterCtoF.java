package Labs.Lab4.temperaturePro;
import java.util.Scanner;

public class converterCtoF {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the temperature in Celsius?: ");
        Double celsiusNum = reader.nextDouble();
        Double fahrenheitConversion = (celsiusNum * 1.8) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheitConversion);
        reader.close();
    }
}