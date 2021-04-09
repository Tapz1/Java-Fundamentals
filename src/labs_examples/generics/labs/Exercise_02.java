package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList
 */

public class Exercise_02 {

    public static void main(String[] args) {

        GenericArray <Integer> numList = new GenericArray<>();
        

    }


}

class GenericArray<T>{
    private ArrayList<T> nums;


    public void setNums(ArrayList<T> nums){
        this.nums = nums;
    }

    /*
    public <T extends Number> int getNums(ArrayList<T> nums) {

        for(T item : this.nums){

        }
        return count;

    }

 */
}