package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        Printer p = () -> System.out.println("Hello");
        p.printThis();

        Printer multTwo = () -> {
          int a = 4, b = 6;
          int c = a*b;
            System.out.println(c);
        };
        multTwo.printThis();

        //int x = 63, y = 38;
        Calculator sum = (x, y) -> x+y;
        int total = sum.calculate(42, 36);
        System.out.println(total);
    }
}

@FunctionalInterface
interface Printer{
    void printThis();
}

@FunctionalInterface
interface Calculator{
    int calculate(int x, int y);
}