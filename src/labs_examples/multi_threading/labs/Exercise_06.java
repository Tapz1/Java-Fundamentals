package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("Implementing the Runnable Interface..");

        Thread.currentThread().setPriority(1);
        BestRunnable thread1 = new BestRunnable("Thread One");

        BestRunnable  thread2 = new BestRunnable("Thread Two");
        Thread.currentThread().setPriority(2);


        System.out.println("--- Thread End ---");
    }
}

class BestRunnable implements Runnable{
    Thread thread;

    public BestRunnable(String name){
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starting.");
        try{
            for(int i=1; i <= 100; i++){
                Thread.sleep(50);
                if(thread.getName().equals("Thread One")){
                    if(i%2 != 0){
                        System.out.println("In " + thread.getName() + ",  " + i);
                    }
                }else{
                    if(i%2 == 0){
                        System.out.println("In " + thread.getName() + ",  " + i);
                    }
                }


            }
        }catch (InterruptedException exc){
            System.out.println(thread.getName() + " was interrupted.");
        }
        System.out.println(thread.getName() + " is now terminating");
    }
}
