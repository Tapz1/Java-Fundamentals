package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 1-7: ");
        int choice = scanner.nextInt();

        if(choice >= 1 && choice <= 7) {
            if (choice == 1) {
                System.out.println("Sunday");
            } else if (choice == 2) {
                System.out.println("Monday");
            } else if (choice == 3) {
                System.out.println("Tuesday");
            } else if (choice == 4) {
                System.out.println("Wednesday");
            } else if (choice == 5) {
                System.out.println("Thursday");
            } else if (choice == 6) {
                System.out.println("Friday");
            } else if (choice == 7) {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Other");
        }
    }
}
