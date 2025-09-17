package Volatile_vs_Atomic;

class SharedResource {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        System.out.println("Now the flag is true now !");
        flag = true;
    }

    public void isFlagTrue() {
        while (!flag) {   // when a thread use to store the value in it's own cache memory to make things memory efficient so if the value of that variable changes it doesnot chane it's value so to make thread doesnot stored the variable in the cache we use 'volatile' keyword.
            // do nothing
        }

        System.out.println("Flag is true now! ");
    }
}

public class VolatileExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread writerThread = new Thread(() -> {
            try{
                Thread.sleep(1000);
                sharedResource.setFlagTrue();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread readerThread = new Thread(() -> sharedResource.isFlagTrue());

        writerThread.start();
        readerThread.start();
   }
    
}