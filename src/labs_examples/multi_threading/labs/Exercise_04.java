package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {
    public static void main(String[] args) {
        ThreadClass myThread = new ThreadClass("dawg");
        System.out.println(myThread.getName());
    }
}

class ThreadClass extends Thread{
    String message = " is synchronized";
    ThreadClass(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        synchronized (ThreadClass.currentThread()){
            System.out.println(message);
        }
    }
}
