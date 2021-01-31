package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word below: ");
        String input = scanner.next();

        String vowels = "aeiou";
        int counter = 0;
        while(counter < input.length()){
            for(int i=0; i < vowels.length();i++){
                if(input.charAt(counter) == vowels.charAt(i)){
                    System.out.println("word: " + input);
                    System.out.println("vowel: " + vowels.charAt(i));
                    break;
                }else{
                    continue;
                }
            }
            counter++;
        }
    }
}
