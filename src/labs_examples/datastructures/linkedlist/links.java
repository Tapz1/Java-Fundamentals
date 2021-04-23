package labs_examples.datastructures.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class links {
    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList();

        // demonstrate adding several elements to the LinkedList
        myList.add("dog");
        myList.add("cat");
        myList.push("First");
        Iterator iter = myList.iterator();

        // demonstrate retrieving one or more element from the LinkedList

        // demonstrate removing several elements from the LinkedList

        // demonstrate at least 4 additional method calls against the LinkedList
        myList.pop();
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));


    }
}
