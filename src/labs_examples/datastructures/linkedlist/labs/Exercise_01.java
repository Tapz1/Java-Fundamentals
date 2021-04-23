package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList();

        myList.add("one");
        myList.addAll(myList);
        myList.addFirst("zero");
        myList.addLast("two");
        myList.getFirst();
        System.out.println(myList.get(1));
        myList.getLast();
        myList.set(2,"new");
        myList.pop();
        myList.push("New first");
        myList.remove(1);
        System.out.println(myList.contains("one"));
        System.out.println(myList.listIterator());
        myList.clear();
    }
}