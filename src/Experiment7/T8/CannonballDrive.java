package Experiment7.T8;

import java.util.Scanner;

public class CannonballDrive {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the X position :");
        Cannonball ball = new Cannonball(scanner.nextDouble());
        System.out.print("Enter the angle :");
        double a = scanner.nextDouble();
        System.out.print("Enter the speed :");
        double v =scanner.nextDouble();
        System.out.println(a+","+v);
        ball.Shoot(a,v);

    }
}
