import java.util.Scanner;


public class booksRead {

    public static void main(String[] args) {


        Scanner bp = new Scanner(System.in);
        System.out.println("How many pages are in the book?");   // These lines of code take an input from a user on how many pages of a book he or she has read.
        double book_pages = bp.nextDouble();

        Scanner bpr = new Scanner(System.in);
        System.out.println("How many pages are you going to read a day?");   // These lines of code take an input from a user on how many days they will read like this.
        double book_pages_read = bpr.nextDouble();

        // Scanner rd = new Scanner(System.in);
        // System.out.println("How many days are you going to read?"); // I've commented this out as I'm still working on a use case for this calculation.
        // double read_days = rd.nextDouble();

        double days_for_book = (book_pages / book_pages_read);
        System.out.println("It will take you " + days_for_book + " days to read this specific book!");  // Calculates how many days it will take to read the specific book they have used for calculation.

        double total_books_a_year = (365 / days_for_book);
        System.out.println("If you read similar books to his, you can read approx " + total_books_a_year + " books a year!"); // Calculates based on a base book: if more of these base books are read with similar page value, how many a year a user would read if continued.

        System.out.println("I think that's a worthy goal!");


    }
}