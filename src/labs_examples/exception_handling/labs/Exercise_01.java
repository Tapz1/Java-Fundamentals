package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int a = 0, b =5;

        try{
            System.out.println(b/a);;
        }catch (ArithmeticException arError){
            System.out.println("Can't divide by zero, fam.");
        }


    }

}