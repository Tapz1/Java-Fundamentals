package labs_examples.static_nonstatic.labs;

public class statics {

    public static void main(String[] args) {
        methodA();

        statics nonStaticCall = new statics();
        nonStaticCall.methodB();

        StaticsB.otherClassMethodA();

        StaticsB nonStaticFromOtherClass = new StaticsB();
        nonStaticFromOtherClass.otherClassMethodB();

    }

    public static void methodA(){
        System.out.println("I'm a static method!");
    }

    public void methodB(){
        System.out.println("I'm a non-static method!");

        // calling a non-static method within the same class
        methodC();

        // calling a non-static method from another class
        StaticsB nonStaticFromOtherClass = new StaticsB();
        nonStaticFromOtherClass.otherClassMethodB();

        // calling a static method within the same class
        methodA();

        // calling a static method from another class
        StaticsB.otherClassMethodA();
    }

    public void methodC(){
        System.out.println("I'm a non-static method!");
    }


}

class StaticsB{

    public static void otherClassMethodA(){
        System.out.println("I'm a static method from another class!");
    }

    public void otherClassMethodB(){
        System.out.println("I'm a non-static method from another class!");
    }
}