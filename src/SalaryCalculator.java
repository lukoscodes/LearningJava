
public class SalaryCalculator {

    public static double salaryCalculator(double hoursPerWeek,
                                          double amountPerHour,
                                          int vocationDays) {
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (amountPerHour < 0) {
            return -1;
        }

        double weeklyPaycheck = hoursPerWeek * amountPerHour;
        double unpaidTime =  vocationDays * amountPerHour * 8;
        return (weeklyPaycheck * 52) - unpaidTime;
    }

    public static void main(String[] args) {
        double salary = salaryCalculator(40, 15, 8);
        System.out.println(salary);

    }



    }

