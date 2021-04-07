package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05 {
    public static void main(String[] args) {
        TheThreader myThread = new TheThreader("dawg");
        System.out.println(myThread.getName());
    }
}

class TheThreader extends Thread{
    boolean running = true;
    String message = " is synchronized";
    TheThreader(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        synchronized (ThreadClass.currentThread()){
            System.out.println(message);

            while(!running)
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            running = false;
            notifyAll();

        }
    }
}