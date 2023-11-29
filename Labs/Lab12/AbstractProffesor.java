package Labs.Lab12;
// Proffesor class that inherits from Person and uses Name, Email, Degree University, and Year Graduated.
public class AbstractProffesor extends AbstractPerson{
    private String degree;
    private String university;
    private int yearGraduated;

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public int getYearGraduated() {
        return yearGraduated;
    }
    public void setYearGraduated(int yearGraduated) {
        this.yearGraduated = yearGraduated;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Degree: "+ degree + "\nUniversity: " + university+ "\nYear Graduated: " + yearGraduated);
    }
    AbstractProffesor(String name, String email, String degree, String university, int yearGraduated)
    {
        super(name, email);
        this.degree = degree;
        this.university = university;
        this.yearGraduated = yearGraduated;
    }
}
