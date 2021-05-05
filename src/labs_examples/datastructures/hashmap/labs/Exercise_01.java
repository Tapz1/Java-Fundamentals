package labs_examples.datastructures.hashmap.labs;

import java.util.*;


/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate you're mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */


public class Exercise_01 {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Chris", "6034441234");
        phoneBook.put("Hannah", "6034544231");
        phoneBook.put("Kristin", "6038672342");

        String userNum = phoneBook.get("Chris");
        System.out.println("Chris' number: " + userNum);
        HashMap<String, String> newPhoneBook = new HashMap<>(phoneBook);
        newPhoneBook.put("John", "6035820207");

        int bookSize = phoneBook.size();
        int newBookSize = newPhoneBook.size();

        System.out.println("Original phone book size: " + bookSize);
        System.out.println("New phone book size: " + newBookSize);

        System.out.println("Does the original phone book have John's info? -> " + newPhoneBook.containsKey("John"));
        System.out.println("New key set: " + newPhoneBook.keySet());

        Set entries = newPhoneBook.entrySet();
        Iterator iterate = entries.iterator();
        while (iterate.hasNext()){
             Map.Entry person = (Map.Entry)iterate.next();
            System.out.println("Key: " + person.getKey() + " | Value: " + person.getValue());

        }

        phoneBook.remove("Kristin");
        phoneBook.replace("Chris","6034441234","6034689088");

        String var = phoneBook.get("Chris");
        System.out.println("Test: " +var);
        for(Map.Entry<String, String> item : newPhoneBook.entrySet()){
            System.out.println(item.getKey() + ", " + item.getValue());
        }

        phoneBook.clear();
    }
}