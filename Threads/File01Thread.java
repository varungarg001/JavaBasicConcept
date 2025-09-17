package Threads;

class File01Thread extends Thread {
    public void run() {
        System.out.println("hello");
        try{
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) throws InterruptedException {
        File01Thread t = new File01Thread();
        System.out.println(Thread.currentThread().getName());

        t.start();
        // t.run();
        System.out.println(t.getState());
        Thread.sleep(100);

        t.join();
        System.out.println("hello world from main");

    }
}
