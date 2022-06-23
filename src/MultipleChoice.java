import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean correct_answer = true;
        while(correct_answer){
        System.out.println("Do you know what colour is my favourite?");
        System.out.println("Blue");
        System.out.println("Red");
        System.out.println("White");
        String userinput = input.next();
        if (userinput.equals("Red")) {
            correct_answer = false;

        }


        }

    }
}
