package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class Exercise_03 {

    public static void main(String[] args) {
        int a = 0, b =5;

        try{
            System.out.println(b/a);;
        }catch (ArithmeticException arError){
            System.out.println("Can't divide by zero, fam.");
        }finally{
            System.out.println("This will always print");
        }


    }

}