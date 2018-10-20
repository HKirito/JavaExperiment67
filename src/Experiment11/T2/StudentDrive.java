package Experiment11.T2;

public class StudentDrive {
    public static void main(String[] arg){
        Student A1 = new Student("Alice","UW","Mage");
        Student A2 = new Student("Alice","UW", "Mage");
        System.out.println(A1.toString());
        System.out.println(A2.toString());
        System.out.println(A1.compareTo(A2));
    }
}
