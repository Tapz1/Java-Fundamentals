package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {

    public static void main(String[] args) {
        ThreadCaller myThread = new ThreadCaller("dawg");
        System.out.println(myThread.getName());
    }
}

class ThreadCaller extends Thread{

    ThreadCaller(String name){
        super(name);
        start();
    }

    @Override
    public void run(){
        System.out.println("runnin'!");
    }
}