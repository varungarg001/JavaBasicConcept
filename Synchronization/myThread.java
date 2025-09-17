package Synchronization;

public class myThread extends Thread{
    private Counter counter;

    myThread(Counter counder) {
        this.counter = counder;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment();
            // System.out.println("thread is: "+Thread.currentThread().getName()+" value of counter "+counter.getCount());
        }
    }

}
