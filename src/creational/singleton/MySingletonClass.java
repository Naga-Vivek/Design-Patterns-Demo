package creational.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MySingletonClass {
    private static Lock lock = new ReentrantLock();
    private static MySingletonClass instance;
    private MySingletonClass() {

    }
    public static MySingletonClass getInstance() {
        // Note : making the getInstance() synchronized, solves concurrency issue
        // but performance wise not good as each thread will be waiting
        // until the current thread completes executing the method.

        // Double check locking - solves concurrency problem and also performance wise good
        if(instance == null) {
            lock.lock();
            if (instance == null) {
                instance = new MySingletonClass();
            }
            lock.unlock();
        }
        return instance;
    }
}
