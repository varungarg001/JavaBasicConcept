package SyncUsingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample implements Runnable {
    private final Lock lock = new ReentrantLock(true); // fairness - starvartion

    int count = 0;

    public void run() {

        lock.lock();
        try{
            for (int i = 0; i < 5000; i++) {
                count++;
                System.out.println("Thread is " + Thread.currentThread().getName() + " Count is - "+count);
            }
        } finally {
            lock.unlock();
        }

    }
    
    public static void main(String[] args) throws Exception {
        LockExample example = new LockExample();
        Thread t1 = new Thread(example);
        Thread t2 = new Thread(example);
        Thread t3 = new Thread(example);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(example.count);
    }

}
