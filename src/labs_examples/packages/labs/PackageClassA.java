package labs_examples.packages.labs;

import labs_examples.packages.labs.labs_examples.packages.labs_examples.packages.PackageClassB;

public class PackageClassA {

    public static void main(String[] args) {
        methodA();
        methodB();

        PackageClassB.methodD();

    }

    protected static void methodA(){
        System.out.println("I'm a protected method!");
    }

    public static void methodB(){
        System.out.println("I'm a public method!");
    }
}
