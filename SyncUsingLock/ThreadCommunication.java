package SyncUsingLock;


class SharedResource{

    private int data;

    private boolean hasData;

    synchronized void  producer(int value){
        while (hasData){
        try{
                wait();


        }catch (InterruptedException e){
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }}
        hasData=true;
        data=value;
        System.out.println("produced "+data);
        notify();
    }

    synchronized int consumer(){

        while(!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }

        }
        hasData=false;
        System.out.println("consumed "+data);
        notify();
        return data;
    }

}

class Producer implements  Runnable{
    private SharedResource resource;

    Producer(SharedResource resource){
        this.resource=resource;
    }

    public void run(){
        for(int i=0;i<10;i++){
            resource.producer(i);
//            System.out.println(value);
        }
    }
}

class Consumer implements  Runnable{
    private SharedResource resource;

    Consumer(SharedResource resource){
        this.resource=resource;
    }

    public void run(){
        for(int i=0;i<10;i++){
           int value= resource.consumer();

        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource),"producerThread");
        Thread consumerTHread = new Thread(new Consumer(resource),"consumerThread");

        consumerTHread.start();
        producerThread.start();

    }
}
