package Experiment7.T5;

import java.util.Scanner;

public class MessageDrive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your want send message:  ");
        String msed = scanner.nextLine();
        My_Message my_message = new My_Message("Rudolf Reindeer","Harry Morgan");
        my_message.append(msed);
        System.out.println(my_message.toString());
    }

}
