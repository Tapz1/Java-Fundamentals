package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class Exercise_02 {

    public static void main(String[] args) {
        int a = 0, b =5;


        try{
            System.out.println(b/a);
        }catch (ArithmeticException arError){
            System.out.println("Can't divide by zero, fam.");
        }catch  (Exception excError){
            System.out.println("I'm a general exception error");
        }
    }
}