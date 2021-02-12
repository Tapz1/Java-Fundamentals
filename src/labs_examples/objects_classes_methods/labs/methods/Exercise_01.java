package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.methods.VarArgsExamples;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("multiplication: "+ multiply(4,2));
        System.out.println("division: "+ divide(4,2));
        myJoke();
        System.out.println("Years to seconds: " + yearsToSeconds(26));

        System.out.println("Length of arguments: " + varargsLength("dog", "cat", "bird"));
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    static void myJoke(){
        System.out.println("Why did Sally fall off the swings?\n Because she had no arms.\n\nKnock knock.\n" +
                "Who's there?\n Not Sally!\n\n");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int yearsToSeconds(int years){
        return (years * 31556952);
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int varargsLength(String... args){
        return args.length;
    }





}
