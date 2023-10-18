package Labs.Lab6;
public class dowhileTest{
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("Do While: ");
        do{
            System.out.println(counter + ") Hello World");
            counter++;
        }while(counter < 11);
    }
}