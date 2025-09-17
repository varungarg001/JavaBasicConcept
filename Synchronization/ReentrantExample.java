package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample extends Thread {

    private final Lock lock = new ReentrantLock();  // you have to make it static so that multiple thread using the same lock

    public void run() {
        outerMethod();
    }

    public void outerMethod() {
        lock.lock();
        try {
            System.out.println("outer method"+Thread.currentThread().getName());
            sleep(1000);
            innerMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
        
    }
    
    public void innerMethod() {
        
        lock.lock();
        try{
            System.out.println("Inner loop" + Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            lock.unlock();
        }
    }
    
    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        
        ReentrantExample example2 = new ReentrantExample();

        ReentrantExample example3 = new ReentrantExample();

        example.start();
        example2.start();
        example3.start();
        example.interrupt();
    }
}