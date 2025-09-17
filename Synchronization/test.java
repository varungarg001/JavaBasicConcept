package Synchronization;

public class test {
    public static void main(String[] args) {
        Counter c = new Counter();
        myThread t1 = new myThread(c);
        myThread t2 = new myThread(c);
        myThread t3 = new myThread(c);

        t1.start();
        t2.start();
        t3.start();

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c.getCount());
    }
}
