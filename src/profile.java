public class profile {

    String firstName;
    String lastName;
    double Year;
    double GPA;
    String Major;

    public profile(String firstName,
                   String lastName,
                   double Year,
                   double GPA,
                   String Major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Year = Year;
        this.GPA = GPA;
        this.Major = Major;
    }

    public double IncrementExpectedGraduationYear(){
        return this.Year + 1;

    }
}
