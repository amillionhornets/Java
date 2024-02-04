package Labs.Lab12;


public class abstractPro {
    public static void main(String[] args) {
        // Person Dyl = new Person("Dylan", "123");
        AbstractProffesor joe = new AbstractProffesor("joe", "123", "123", "OCU", 2204);
        AbstractStudent jacob = new AbstractStudent("jacob", "123", "comp", 4);
        jacob.printNameAndEmail();
        jacob.printInfo();

        // joe.printNameAndEmail();
        // joe.printInfo();

        // Dyl.printInfo();
    }
    
}
