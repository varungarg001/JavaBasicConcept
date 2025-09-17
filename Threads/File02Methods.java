package Threads;

public class File02Methods implements Runnable {
    @Override
    public void run() {

        while (true) {
            System.out.println("hello wolrd:");
        }

        // for (int i = 0; i < 100; i++) {
        //     System.out.println(Thread.currentThread().getName() + " is runnning "+" count "+i);
        //     Thread.yield();
        // }

        // try{
        //     Thread.sleep(1000);
        //     System.out.println("Thread is running... ");
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }




        // System.out.println("hello");

        // for (int i = 0; i < 5; i++) {
        //     System.out.println(Thread.currentThread().getName() + " - priority: " + Thread.currentThread().getPriority()+" -count "+i);
        //     try{
        //         Thread.sleep(100);
        //     } catch (Exception e) {
        //         System.out.println(e.getMessage());
        //     }
        // }
    }

    public static void main(String[] args) throws InterruptedException {
        File02Methods t = new File02Methods();
        Thread thread1 = new Thread(t,"varun");
        thread1.setDaemon(true); //Daemon thread
        thread1.start();


        System.out.println("main done which is non daemon thread");



        Thread thread2 = new Thread(t,"kumar"); // user thread
        thread2.start();
        // thread1.interrupt();
        


        // Thread thread2 = new Thread(t,"Medium Priority");
        // Thread thread3 = new Thread(t,"Highest priority");

        // thread1.setPriority(Thread.MIN_PRIORITY);
        // thread2.setPriority(Thread.NORM_PRIORITY);
        // thread3.setPriority(Thread.MAX_PRIORITY);
        
        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread1.join();



        // System.out.println("After execution of thread");

    }
}


// Methods of Thread class 
// Start
// getName
// setName
// sleep
// join
// setPriority - we can set the priority of thread but it upto OS to decide which thread will o first we just give a hint.
// Interrupt - use to interupt the thread
// yield - it is a hint to the scheduler that please give chances to the other thread also
// DAEMON thread - threads are running in background and jvm doesnot wait to complete their execution.