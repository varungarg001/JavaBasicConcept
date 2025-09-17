package Synchronization;

public class Main {
    public static void main(String[] args) {
        problemWithSync a = new problemWithSync();
        Runnable runnable = new Runnable() {
            public void run(){
                a.withdraw(50);
            }
        };

        Thread t1 = new Thread(runnable, "varun");
        Thread t2 = new Thread(runnable, "kumar");
        t1.start();
        t2.start();


    }
}
