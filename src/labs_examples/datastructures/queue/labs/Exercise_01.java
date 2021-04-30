package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */


public class Exercise_01 {
    public static void main(String[] args) {
        PriorityQueue<Integer> myQueue = new PriorityQueue<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println(myQueue.peek());

        boolean hasNum = myQueue.contains(2);
        System.out.println("Contains \"2\"? -> " + hasNum);

        int numA = myQueue.remove();
        System.out.println(numA);

        int numB = myQueue.element();
        System.out.println(numB);
        System.out.println("removing: " + myQueue.poll());

        myQueue.clear();
    }
}

