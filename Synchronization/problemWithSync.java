package Synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class problemWithSync {
    int balance = 100;

    final Lock lock = new ReentrantLock();

    public void withdraw(int x) {
        try {
            System.out.println("Thread "+Thread.currentThread().getName()+" attempt to withdraw ");
            if (lock.tryLock(1000,TimeUnit.MILLISECONDS)) {
                if (balance >= 50) {
                    System.out.println("Thread "+Thread.currentThread().getName()+" processing the withdraw ");
                    balance -= x;
                    try{
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                        System.out.println(e.getMessage());
                    } finally {
                        lock.unlock();
                    }
                    System.out.println("Remaining amount: "+balance);

                } else {
                    System.out.println("insufficient amount cannot withdraw money ");
                }
            } else {
                System.out.println("Could not acquire lock");

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();  // if dont do that we will lose the state of the thread if any interruption occur in the thread execution so store its state we use interrupt method.
        } 

    }

    }

// the main problem with the sync block is if a thread gets into the critical section it locks the place means no other can enter in the that critical section untill that thread complete their execution whether it takes long time but other thread does not get into the critical section
