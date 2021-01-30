package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // write your code below

        if (a || b){
            System.out.println("either a or b is true");
        }

        if (a & b){
            System.out.println("both a & b are true");
        }
        else{
            System.out.println("both a & b are not true");
        }
        // now your turn :)
        if (a && b){
            System.out.println("both a && b are true");
        }

        boolean xorVal = (a ^ b);
        System.out.println("both a & b are true, but only one can be true with XOR, therefore, this is: " + xorVal);

        if(!b){
            System.out.println("b = Not true!");
        }
        System.out.println("Should print false: " + !true);


    }

}

