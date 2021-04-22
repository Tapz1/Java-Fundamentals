package labs_examples.generics;

public class Comparing {

    public static void main(String[] args) {

    }

    /**
     * 1. Make the method generic and bound it to "extends Comparable<T>"
     * 2. Replace the int types for the generic T
     * 3. Change the comparisons ">" for "value1.compareTo(value2)""
     */

/*
    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;   // assume x is initially the largest

        if(max.compareTo(y)) {
            max = y;   // y is the largest so far
        }

        if(z.compareTo(y)) {
            max = z;   // z is the largest now
        }
        return max;   // returns the largest object
    }
}
*/
}