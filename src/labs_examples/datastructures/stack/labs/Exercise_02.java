package labs_examples.datastructures.stack.labs;

import java.util.ArrayList;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize an new array of a Generic type you can use this:
 *           Object[] data = (T[]) new Object[10];
 */

public class Exercise_02 {
    public static void main(String[] args) {

    }
}

class CustomStack<T>{
    ArrayList<T> stack = new ArrayList<>();

    public void push(T item){
        stack.add(0, item);
    }

    public T pop(){
        try{
            T item = stack.get(0);
            stack.remove(0);
            return item;
        }catch (NullPointerException e){
            e.getMessage();
            return null;
        }
    }

    public boolean empty(){
        return stack.isEmpty();
    }
}
