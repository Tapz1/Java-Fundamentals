package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MethodTraining {

    public static void main(String[] args) {
        System.out.println(largestNumber(41, 68, 12));

        Pi myPi = new Pi(3.1415926535);

        System.out.println("Pass by reference ex: " + myPi.numPi);
        changePi(myPi);
        System.out.println("Pass by value (changing initial value): "+ myPi.numPi);

        System.out.println("# of consonants in your word: " + numOfConsonants("food"));

        int numCheck = 23;
        System.out.println(numCheck + isPrime(numCheck));

        int[] nums = {10, 44, 3, 16, 92, 12};
        System.out.println("new list with lowest and highest number: ");
        for(int number : highsAndLows(nums)){
            System.out.print(number + " | ");
        }

        System.out.println();
        System.out.println("Your array with two divisors: ");
        for(int num : newArray(10, 4, 2)){
            System.out.printf("%3d | ", num );

        }

        System.out.println();
        System.out.println("Here's your reversed array: ");
        int[] arrayToReverse = {1,2,3,4,5,6,7,8,9, 10};
        for(int num : reverseArray(arrayToReverse)){
            System.out.printf("%02d | ", num);
        }

    }

    // methods

    public static int[] reverseArray(int[] yourArray){
        int temp = 0;
        for(int i=0; i < yourArray.length/2; i++){
            temp = yourArray[i];
            yourArray[i] = yourArray[yourArray.length - (i+1)];
            yourArray[yourArray.length - (i+1)] = temp;
        }

        return yourArray;
    }


    public static int[] highsAndLows(int[] nums){
        Arrays.sort(nums);
        int[] newList = new int[2];
        newList[0] = nums[0];
        newList[1] = nums[nums.length-1];
        return newList;
    }

    public static ArrayList<Integer> newArray(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> myArray = new ArrayList<Integer>(maxNum);

        for(int i=0; i < maxNum; i++){
            if(i % divisor1 == 0 && i % divisor2 == 0){
                myArray.add(i);
            }
        }
        System.out.println("Array size:" + myArray.size());

        return myArray;
    }


    public static int largestNumber(int a, int b){
        return Math.max(a, b);

    }

    public static int largestNumber(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }

    public static int largestNumber(int a, int b, int c, int d){
        return Math.max(Math.max(Math.max(a, b), c), d);
    }

    public static void changePi(Pi numPi){
        numPi.setNumPi(4);
    }

    public static int numOfConsonants(String words){
        int total = 0;
        words.toLowerCase();
        for(int i=0; i < words.length(); i++){
            if(words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i' || words.charAt(i) == 'o' || words.charAt(i) == 'u' ){
                continue;
            }else{
                total++;
            }
        }
        return total;
    }

    public static String isPrime(int number){
        boolean isNumPrime = true;
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                isNumPrime = false;
                break;
            }
        }
        if(isNumPrime){
            return " is prime";
        }else{
            return " is not prime";
        }

    }

}

    class Pi{
        double numPi;

        public Pi(double numPi){
            this.numPi = numPi;
        }

        public double getNumPi() {
            return numPi;
        }

        public void setNumPi(double numPi) {
            this.numPi = numPi;
        }

        @Override
        public String toString() {
            return "Pi{" +
                    "numPi=" + numPi +
                    '}';
        }
    }

