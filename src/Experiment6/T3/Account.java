package Experiment6.T3;

import java.text.NumberFormat;
import java.util.Random;

public abstract class Account{
    private String AccountNum;
    private double AccountBalance;

    public String getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(String accountNum) {
        AccountNum = accountNum;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public void deposit(int Money) {
        AccountBalance += Money;
        System.out.println("Deposit is Succeed !");
    }

    public Account(){ }

    public Account(double newBalance) {
        Random random = new Random();
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < 5; i++) {
            str.append(String.valueOf(Math.abs(random.nextInt())%10)) ;
        }
        AccountNum = str.toString();
        AccountBalance = newBalance;
    }

    public abstract void withdraw(double balance);

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println("Account ["+getAccountNum() + "] Having " +nf.format(getAccountBalance()));
        return "";
    }
}
