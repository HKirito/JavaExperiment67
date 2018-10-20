package Experiment6.T3;

import java.util.Scanner;

public class AccountDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("初始化账户，请输入余额：");
        double count = scanner.nextDouble();
        System.out.print("请输入最小余额：");
        double mini = scanner.nextDouble();
        System.out.print("请输入透支费用：");
        double over = scanner.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(count,mini,over);
        System.out.println("CheckingAccount create succeed !"+checkingAccount.toString());
        checkingAccount.withdraw(40);
        checkingAccount.toString();
    }
}
