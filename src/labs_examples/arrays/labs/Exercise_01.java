package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int[] numArray = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter in 10 numbers, hitting enter after each one: ");

        // builds the array by taking inputs
        for(int i=0; i < numArray.length; i++){
            System.out.println("Number " + (i+1) + ": ");
            int numChoice = scanner.nextInt();
            numArray[i] = numChoice;
        }
        // sums up the numbers in the array
        int sum = 0;
        for(int num : numArray){
            sum += num;
        }
        System.out.print("Here's the sum of the numbers you chose: " + sum);

    }
}