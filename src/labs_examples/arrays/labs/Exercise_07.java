package labs_examples.arrays.labs;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(30);

        for(int i=0; i < 20; i++){
            list.add(i*2);
            System.out.print(list.get(i) + " | ");
        }

        list.remove(5);

        System.out.print("\nHere's the updated list with no multiples of 3 & 5th index: ");
        for(Integer newItems : list){
            if(newItems % 3 == 0) {
                continue;
            }
            System.out.print(newItems + " | ");

        }




    }
}
