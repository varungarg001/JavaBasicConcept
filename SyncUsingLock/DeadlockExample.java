package SyncUsingLock;
class Paper {
    synchronized void writeWithPaperPen(Pen pen) {
        System.out.println("paper class have the lock " + this + " and trying to lock the pen");
        pen.finishWriting();
    }

    synchronized void finishWriting() {
        System.out.println("finishing writing");
    } 
}

class Pen {
    synchronized void writeWithPaperPen(Paper paper) {
        System.out.println("pen class have the lock " + this + " and trying to lock the paper");
       paper.finishWriting();
    }

    synchronized void finishWriting() {
        System.out.println("finishing writing");
    }
}

class task1 implements Runnable {
    private Paper paper;
    private Pen pen;

    task1(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    public void run() {
        synchronized (pen) {
           paper.writeWithPaperPen(pen);
        }
    }

}

class task2 implements Runnable {
    private Paper paper;
    private Pen pen;

    task2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    public void run() {
        pen.writeWithPaperPen(paper);
    }
}


public class DeadlockExample {

    public static void main(String[] args) {
        Paper p1 = new Paper();
        Pen p2 = new Pen();

        Thread t1 = new Thread(new task1(p1, p2), "Thread-1");
        Thread t2 = new Thread(new task2(p1, p2), "Thread-2");

        t2.start();
        t1.start();
    }
}
