package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

public class Exercise_07 {

    public static void main(String[] args){
        try{
            buyFood(0);
        }catch(MoneyError noCashErr){
            System.out.println(noCashErr.toString());
        }

    }

    public static void buyFood(int money) throws MoneyError{
        if(money < 1){
            throw new MoneyError();
        }else{
            System.out.println("You're good");
        }
    }
}

class MoneyError extends Exception{

    @Override
    public String toString() {
        return "Not enough money";
    }
}