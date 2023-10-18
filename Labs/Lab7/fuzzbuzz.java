package Labs.Lab7;

public class fuzzbuzz {
    public static void main(String[] args) {
        // Loops through 1-100 and prints out either the index, Fizz, Buzz, or Fizz Buzz
        for(int index = 1; index < 101; index++){
            if(index%3 == 0 || index%5 == 0){
                if(index%3 == 0){
                    System.out.print("Fizz");
                }
                if(index%5 == 0){
                    System.out.print("Buzz");
                }
            }else{
                System.out.print(index);
            }
            System.out.print(", \n");
        }
    }
}
