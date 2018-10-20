package Experiment6.T3;

import java.io.IOException;
import java.util.Scanner;

public class CheckingAccount extends Account  {
    private double MinimumBalance;
    private double OverdraftFee;

    public double getMinimumBalance() {
        return MinimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        MinimumBalance = minimumBalance;
    }

    public double getOverdraftFee() {
        return OverdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        OverdraftFee = overdraftFee;
    }

    public CheckingAccount(double balance,double Min, double over){
        super(balance);
        MinimumBalance = Min;
        OverdraftFee = over;
    }

    @Override
    public String toString() {
        System.out.println(super.toString()
                          +"MinimumBalance is "+getMinimumBalance()
                          +" OverdraftFee is "+getOverdraftFee());
        return "";
    }

    @Override
    public void withdraw(double balance) {
        System.out.println("-----WithDraw Operation----");
        if (balance-getAccountBalance()> MinimumBalance){
            setAccountBalance(getAccountBalance()-balance-OverdraftFee);
        }else {
            setAccountBalance(getAccountBalance()-balance);
        }
        System.out.println("Balance is Succeed ! "+"\n"+"  The  Left :"+"\n"+getAccountBalance());
    }

}
