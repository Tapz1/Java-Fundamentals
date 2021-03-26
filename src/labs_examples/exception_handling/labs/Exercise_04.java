package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {
        int a = 0, b =5;
        int[] numArray = new int[3];

        try{
            System.out.println(b/a);
        }catch (ArithmeticException arError){
            System.out.println("Can't divide by zero, fam.");

            try {
                System.out.println(b/0);
            }catch (ArithmeticException anError){
                System.out.println("We're trying again");
            }
        }


    }

}