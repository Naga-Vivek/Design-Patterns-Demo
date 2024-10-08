package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonClient {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            MySingletonClass mySingletonClassObj = MySingletonClass.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + mySingletonClassObj);
        };
        // We can implement the run method of Runnable in two ways
        // 1. Using a Anonymous class by .          new Runnable(){ // implementation to override run method };
        // 2. Using Lambda Expression .             () -> {implementation}

        // Unless double check locking is used ,
        // Singleton Pattern by default doesn't make sense in multithreaded environment, as multiple threads can create multiple instances.

/*        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.start();

        Thread t3 = new Thread(runnable);
        t3.start();

        Thread t4 = new Thread(runnable);
        t4.start();*/

        ExecutorService executorService = Executors.newFixedThreadPool(9);
        executorService.execute(runnable);
        for(int i=0;i<9;i++){
            executorService.execute(runnable);
        }
        executorService.shutdown();

    }
}
