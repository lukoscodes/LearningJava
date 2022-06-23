public class profile2 {
    public static void main(String[] args) {

        profile student1 = new profile ("John", "Paul",1991,47.5,"Science");
        profile student2 = new profile ("Egle","Valeikaite", 2015,40,"Marketing");

        System.out.println(student1);
        System.out.println(student2);

        double student1Year = student1.IncrementExpectedGraduationYear();
        System.out.println(student1Year);



    }
}
