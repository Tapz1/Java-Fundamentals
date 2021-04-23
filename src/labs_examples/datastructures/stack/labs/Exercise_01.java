package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack();
        if(myStack.empty()){
            System.out.println("empty stack!");
        }

        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.push("five");

        System.out.println(myStack.size());

        System.out.println("Top of stack: " + myStack.peek());
        System.out.println(myStack.search("two"));
        String varA = myStack.pop();
        System.out.println(varA);
    }
}