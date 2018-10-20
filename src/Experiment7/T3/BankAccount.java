package Experiment7.T3;

public class BankAccount {
    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        final double PENALTY =10;
        if (amount > balance){
            balance = balance - PENALTY;
        }
        else {
            balance = balance - amount;
        }
    }

    public void addInterest(double rate){
        double amount = balance * rate /100;
        balance = balance +amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
}
