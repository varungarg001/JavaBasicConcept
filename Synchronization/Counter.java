package Synchronization;

public class Counter  {
    private int count = 0;
    
    public synchronized  void increment() {
        count++;
        // System.out.println(count+Thread.currentThread().getName());
    }

    int getCount() {
        return count;
    }




}
