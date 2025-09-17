package SyncUsingLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteLocks {
    private int counter = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    

    private final Lock readLock = lock.readLock();

    private final Lock writeLock = lock.writeLock();

    public void read() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " " + counter);
        } finally {
            readLock.unlock();
        }
    }
     
    public void increment() {
        writeLock.lock();

        try {
            counter++;

        } finally {
            writeLock.unlock();
        }

    }
    
    public static void main(String[] args) throws InterruptedException {
        ReadAndWriteLocks readAndWriteLocks = new ReadAndWriteLocks();
        Runnable writeTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    readAndWriteLocks.increment();
                    
                }
            }
        };

        Runnable readTask = new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    readAndWriteLocks.read();
                }
            }
        };

        Thread w1 = new Thread(writeTask);
        Thread r1 = new Thread(readTask);
        Thread r2 = new Thread(readTask);

        r1.start();
        r2.start();
        w1.start();

        w1.join();
        r1.join();
        r2.join();

        readAndWriteLocks.read();
    }
}
