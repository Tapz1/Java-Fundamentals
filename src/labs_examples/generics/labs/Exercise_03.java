package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 <T extends Number, U extends Number>{

    public static void main(String[] args) {
        Exercise_03 classCeption = new Exercise_03();

        System.out.println(classCeption.getSum(4.0, 5.0));
        System.out.println(getSumTwo(5, 6));
    }

    public double getSum(T objOne, U objTwo){
        return objOne.doubleValue() + objTwo.doubleValue();
    }

    public static <T extends Number, U extends Number> double getSumTwo(T objOne, U objTwo) {
        return objOne.doubleValue() + objTwo.doubleValue();
    }

}
