package labs_examples.lambdas.labs;

import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        Print print = Exercise_03::printMe;
        System.out.println(print.getThis(10));

        // instance
        int a = 64, b = 13;
        PrintWithTwo printTwo = Exercise_03::sum;
        int total = printTwo.getThis(a, b);
        System.out.println("With an instance method reference: " + total);

    }

    public static int printMe(int a){
        return a;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    @FunctionalInterface
    interface Print{
        int getThis(int a);
    }

    @FunctionalInterface
    interface PrintWithTwo{
        int getThis(int a, int b);
    }
}

