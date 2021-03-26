package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

public class Exercise_05 {

    public static void main(String[] args){

        try{
            divide();
        }catch(ArithmeticException arErr){
            System.out.println("Can't divide by zero");
        }

    }

    public static void divide() throws ArithmeticException{
        int a = 0, b =5;
        System.out.println(b/a);
        throw new ArithmeticException();
    }
}
