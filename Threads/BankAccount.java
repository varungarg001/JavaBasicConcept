package Threads;

public class BankAccount  {  // main thread
    static int balance = 200000;

    public class BankActivity implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread is "+Thread.currentThread().getName()+" "+balance);
            balance += 1;
            System.out.println("Thread is "+Thread.currentThread().getName()+" "+balance);
        }
    }

    
    
    

    
}