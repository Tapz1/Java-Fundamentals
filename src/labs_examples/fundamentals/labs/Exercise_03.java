package labs_examples.fundamentals.labs;

import java.sql.SQLOutput;

/**
 * Fundamentals Exercise 3: My First Program
 *
 *      Write the necessary code to display the follow message to the console
 *
 *      Hello World!
 *      Check out my first program!
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // write code to print out "Check out my first program!" below
        System.out.println("Check out my first program!");

        boolean trueVal = true;
        boolean falseVal = false;
        if (trueVal){
            System.out.println("This will print - #4");
        }
        if (falseVal){
            System.out.println("This will not print - #5");
        }
        if (trueVal && falseVal){
            System.out.println("This will not print - #6");
        }
        if (trueVal ^ falseVal){
            System.out.println("This will print - #7");
        }
        if (!falseVal){
            System.out.println("This will print - #8");
        }

    }


}
