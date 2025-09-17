package Threads;
// import Threads.BankAccount;

public class BankBranch {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Thread[] t = new Thread[100];

        for (int i = 0; i < 100; i++) {
            Thread tc = new Thread(ba.new BankActivity());
            t[i] = tc;
        }

        for (int i = 0; i < 100; i++) {
            t[i].start();
        }

        System.out.println(BankAccount.balance);

    }
    
    
}