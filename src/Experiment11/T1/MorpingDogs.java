package Experiment11.T1;

import java.util.Scanner;

public class MorpingDogs {
    public static void main(String[] args){
        Dog myDog;
        String ans = "y";
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (ans.equalsIgnoreCase("y")){
            System.out.println("Choose a Breed:\n1.Labrador\n2.Yorkshire");
            choice = scanner.nextInt();
            if (choice == 1)
                myDog = new Labrador();
            else
                myDog = new Yorkshire();
            System.out.println(myDog.speak());

            System.out.println("Try again?");
            ans = scanner.next();
        }
    }
}
