package Labs.Lab12;
// Person class that takes in name and email in the constuctor.
abstract class AbstractPerson {
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
    public abstract void printInfo();
    AbstractPerson(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
}