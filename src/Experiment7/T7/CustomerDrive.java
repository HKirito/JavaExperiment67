package Experiment7.T7;

import java.util.Scanner;

public class CustomerDrive {
    public static void main(String[] args){
        Customer A = new Customer();
        System.out.print("Enter you Balance :");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            A.makePurchase(scanner.nextDouble());
            System.out.println(A.toString());
            System.out.print("Enter you Balance :");
        }

    }
}
