package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("We're going to calculate the sum and average between two numbers.\n");
        System.out.println("Enter you first number: ");
        int lowerBound = scanner.nextInt();
        System.out.println("Next, enter a number that's higher than that: ");
        int upperBound = scanner.nextInt();

        System.out.println("The sum from one number to the next is: " + sum(lowerBound,upperBound));
        System.out.println("The average is: " + avg(lowerBound,upperBound));


    }

    public static int sum(int lowerBound, int upperBound){
        int sumTotal = 0;
        for(; lowerBound <= upperBound; lowerBound++){
            sumTotal += lowerBound;

        }
        return sumTotal;
    }

    public static double avg(int lowerBound, int upperBound){
        double avgTotal = 0;
        int counter = 0;
        for(; lowerBound <= upperBound; lowerBound++){
            avgTotal += lowerBound;
            counter++;

        }
        return (avgTotal / counter);
    }
}
