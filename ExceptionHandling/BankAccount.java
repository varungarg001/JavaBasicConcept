package ExceptionHandling;


public class BankAccount {
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount )throws CustomException {
        if(amount>balance){
            throw new CustomException();
        }else{
            balance-=amount;
        }
    }
    double getBalance(){
        return balance;
    }
}
