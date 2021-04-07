package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */


public class Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Implementing the Runnable Interface..");

        Thread.currentThread().setPriority(1);
        MyRunnable thread1 = new MyRunnable("Runnable One");

        MyRunnable  thread2 = new MyRunnable("Runnable Two");
        Thread.currentThread().setPriority(2);


        System.out.println("--- Thread End ---");
    }
}

class MyRunnable implements Runnable{
    Thread thread;

    public MyRunnable(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try{
            for(int i=0; i <10; i++){
                Thread.sleep(500);
                System.out.println("In " + thread.getName() + ", the count is at " + i);
            }
        }catch (InterruptedException exc){
            System.out.println(thread.getName() + " was interrupted.");
        }
        System.out.println(thread.getName() + " is now terminating");
    }
}