package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        System.out.println("The volume is: " + volumeOfCylinder(3.14, 5));
        System.out.println("The surface area is: " + surfaceArea(3.14, 5));


    }

    public static double volumeOfCylinder(double radius, double height){
        return (3.14 * (radius * radius) * height);

    }

    public static double surfaceArea(double radius, double height){
        return((2 * 3.14 * radius * height) + (2 * 3.14 * (radius * radius)));
    }
}