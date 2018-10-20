package Experiment6.T1;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonDrive {
    public static void main(String[] args){
        int i = 0;
        String fristName = "";
        String LastName = "";
        int age = 0;
        ArrayList<Person> Array = new ArrayList<Person>();
        while(i < 2){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the "+ ( i+1 ) +" Person FirstName :");
            fristName = scanner.nextLine();
            System.out.print("Please input the "+ ( i+1 ) +" Person LastName :");
            LastName = scanner.nextLine();
            System.out.print("Please input the "+ ( i+1 ) +" Person age :");
            age = scanner.nextInt();
            Array.add(new Person(fristName,LastName,age));
            i++;
        }
        Array.get(0).equals(Array.get(1));
        System.out.println("The result is "+ Array.get(0).equals(Array.get(1)));
    }
}
