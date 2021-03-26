package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args){
        try{
            drinkMilk(0);
        }catch(MilkError heNeedSomeMilkErr){
            System.out.println(heNeedSomeMilkErr.toString());
        }

    }

    public static void drinkMilk(int money) throws MilkError{
        if(money < 1){
            throw new MilkError();
        }else{
            System.out.println("You're good");
        }
    }
}

class MilkError extends Exception{

    @Override
    public String toString() {
        return "No more milk!";
    }
}