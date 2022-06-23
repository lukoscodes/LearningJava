public class profile {

    String firstName;
    String lastName;
    int Year;
    double GPA;
    String Major;

    public profile(String firstName,
                   String lastName,
                   int Year,
                   double GPA,
                   String Major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Year = Year;
        this.GPA = GPA;
        this.Major = Major;
    }

    public int IncrementExpectedGraduationYear(){
        return this.Year + 1;

    }
}
