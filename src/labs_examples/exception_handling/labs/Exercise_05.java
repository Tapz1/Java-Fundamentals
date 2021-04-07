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
            divide(0, 5);
        }catch(ArithmeticException arErr){
            System.out.println("Can't divide by zero");
        }

    }

    public static void divide(int a, int b) throws ArithmeticException{
        if(a == 0){
            throw new ArithmeticException();
        }

        System.out.println(b/a);


    }
}
// syntax error, runtime error, logic errors = toughest