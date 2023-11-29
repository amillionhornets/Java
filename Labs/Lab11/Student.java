package Labs.Lab11;
// Student Class inherits from Person and uses Name, Email, Major, and Year in school in the constructor.
public class Student extends Person{
    private int yearInSchool;
    private String major;
    public void setYearInSchool(int gradeYear){
        this.yearInSchool = gradeYear;
    }
    public int getYearInSchool(){
        return yearInSchool;
    }
    public void setMajor(String studentMajor){
        this.major = studentMajor;
    }
    public String getMajor(){
        return major;
    }
    @Override
    public void printInfo() {
        
        super.printInfo();
        System.out.println("Major: " + major + "\nYear in School: " + yearInSchool);
    }
    Student(String name, String email, String major, int yearInSchool){
        super(name, email);
        this.major = major;
        this.yearInSchool = yearInSchool;
    }
}
