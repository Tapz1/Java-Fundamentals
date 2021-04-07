package labs_examples.packages.labs.labs_examples.packages.labs_examples.packages;

import labs_examples.packages.labs.PackageClassA;

public class PackageClassB {

    public static void main(String[] args) {
        PackageClassA callMethodA = new PackageClassA();
        //callMethodA(); // can't call on the protected class from another package

        PackageClassA.methodB(); // public can be accessed

        methodC(); // can be accessed within the same class
        methodD();

    }

    protected static void methodC(){
        System.out.println("I'm a protected method!");
    }

    public static void methodD(){
        System.out.println("I'm a public method!");
    }
}
