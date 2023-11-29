package Labs.Lab11;
// Person class that takes in name and email in the constuctor.
public class Person {
    private String name;
    private String email;
    public void setName(String personName){
        this.name = personName;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String personEmail){
        this.email = personEmail;
    }
    public String getEmail(){
        return email;
    }
    public void printInfo(){
        System.out.println("Name: " + name + "\nemail: " + email);
    }
    Person(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
}