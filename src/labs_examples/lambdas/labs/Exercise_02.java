package labs_examples.lambdas.labs;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    // one
        Predicate check = (x) -> true;
        boolean isTrue = true;
        System.out.println(check.test(isTrue));

    // two
        BinaryOperator type = (a, b) -> b;
        System.out.println(type.apply(10,12));

    // three
        Function result = (a) -> a;
        System.out.println(result.apply("sock"));

    //four

    }
}