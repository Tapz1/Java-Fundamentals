package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01{

    public static void main(String[] args) {
        GenericClass <Integer, Double> genOne = new GenericClass(4, 34.5);
        GenericClass <Integer, Double> genTwo = new GenericClass(6, 86.3);

        System.out.println(genOne.toString());
        System.out.println(genTwo.toString());

        genOne.setNumTwo(10.0);
        double newNum = genOne.getNumTwo() + genTwo.getNumTwo();
        System.out.println(newNum);
    }
}

class GenericClass<T, U>{
    private T numOne;
    private U numTwo;

    public GenericClass(T numOne, U numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
    }


    public T getNumOne() {
        return numOne;
    }

    public void setNumOne(T numOne) {
        this.numOne = numOne;
    }

    public U getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(U numTwo) {
        this.numTwo = numTwo;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "numOne=" + numOne +
                ", numTwo=" + numTwo +
                '}';
    }
}