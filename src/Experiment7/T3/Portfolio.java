package Experiment7.T3;

import Experiment6.T3.Account;

import java.util.List;
import java.util.Scanner;

public class Portfolio {
    private BankAccount checking;
    private BankAccount savings;

    public Portfolio(){
        savings = new BankAccount(0);
        checking = new BankAccount(0);
    }

    public Portfolio(double balance,String account){
        savings = new BankAccount(0);
        checking = new BankAccount(0);
        whichone(account).deposit(balance);
    }

    public void deposit(double amount,String account){
        this.whichone(account).deposit(amount);
    }

    public BankAccount whichone(String account){
        if ("s".equals(account) ||"S".equals(account)){
            System.out.println("The Operation in SavingAccount\n");
            return this.savings;
        }else if("c".equals(account) ||"C".equals(account)){
            System.out.println("The Operation in CheckingAccount\n");
            return this.checking;
        }else {
            System.out.println("Refuse Operation !");
            return new BankAccount();
        }
    }

    public void withdraw(double amount, String account){
       this.whichone(account).withdraw(amount);
    }

    public void transfer(double amount,String account){
        if (account == "S" || account == "s"){
            this.savings.withdraw(amount);
            this.checking.deposit(amount);
            System.out.println("The transfer from SavingAccount to CheckingAccount");
        }else if(account == "C" || account == "c"){
            this.checking.withdraw(amount);
            this.savings.deposit(amount);
            System.out.println("The transfer from CheckingAccount to SavingAccount");
        }else {
            System.out.println("Refuse Operation !");
            return;
        }
    }

    public double getBalance(String account){
        return this.whichone(account).getBalance();
    }

    @Override
    public String toString() {
        System.out.println("The savingAccount having: "+this.savings.getBalance()
                +"\nThe checkingAccount having: "+this.checking.getBalance()+"\n");
        return super.toString();
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter you money for create account(money/c or money/s) : ");
        String message = scanner.nextLine();
        String[] oper = message.split("/");
        if (oper.length<2){
            System.out.println("Create Failed !");
            return;
        }
        Portfolio n1 = new Portfolio(Double.parseDouble(oper[0]),oper[1]);
        n1.toString();
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.print("Please Enter you want to do \n" +
                    " 1.Deposit\n2.WithDraw\n3.Transfer\nanother.Quit :");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.print("Enter your Balance and Account(balance/account):");
                    String o = scanner1.nextLine();
                    oper = o.split("/");
                    if (oper.length < 2) {
                        System.out.println("Operation Failed !");
                        return;
                    } else {
                        n1.deposit(Double.parseDouble(oper[0]), oper[1]);
                        n1.toString();
                    }
                    break;
                case 2:
                    System.out.print("Enter your Balance and Account(balance/account):");
                    String p = scanner1.nextLine();
                    oper = p.split("/");
                    if (oper.length < 2) {
                        System.out.println("Operation Failed !");
                        return;
                    } else {
                        n1.withdraw(Double.parseDouble(oper[0]), oper[1]);
                        n1.toString();
                    }
                    break;
                case 3:
                    System.out.print("Enter your Balance and Account(balance/account):");
                    String e = scanner1.nextLine();
                    oper = e.split("/");
                    if (oper.length < 2) {
                        System.out.println("Operation Failed !");
                        return;
                    } else {
                        n1.transfer(Double.parseDouble(oper[0]), oper[1]);
                        n1.toString();
                    }
                    break;
                default:
                    return;
            }
        }
    }
}
