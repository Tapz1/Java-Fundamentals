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

        GenericArray <Double> numList = new GenericArray<>();
        ArrayList <Double> newList = new ArrayList<>();
        newList.add(15.0);
        newList.add(18.50);
        newList.add(100.60);
        newList.add(109.0);
        newList.add(5.0);
        numList.setNums(newList);
        System.out.println(numList.getNums());
    }


}

class GenericArray<T extends Number>{
    private ArrayList<T> nums;


    public void setNums(ArrayList<T> nums){
        this.nums = nums;
    }


    public double getNums() {
        double sum = 0;
        for(T item : this.nums){
            sum += item.doubleValue();
        }
        return sum;

    }
}