package Volatile_vs_Atomic;

import java.util.concurrent.atomic.AtomicInteger;

class SharedObj {
    // private volatile int counter = 0; // volatile is use to not store the value in the cache value they read the value from the main memory but it does not mean that at a time only a thread gets the access to the variable so multiple threads can get access to the variable at a time which leads to the race condition to solve this we can use atomicity variable

    AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        counter.incrementAndGet();
    }

    public int getCounterInfo(){
        return counter.get();
    }

}

public class AtomicityExample {
    public static void main(String[] args) throws InterruptedException{
        SharedObj sharedObj = new SharedObj();

        Thread t1 = new Thread(()->{
            for(int i=0;i<5000;i++){
                sharedObj.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<5000;i++){
               sharedObj.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Program Finished: "+sharedObj.getCounterInfo());
    }
    
}