package Experiment11.T2;

import java.text.DecimalFormat;
import java.util.Random;

public class Student implements Comparable<Student>{

    private String name;
    private String address;
    private String major;
    private double GPA;
    private static Random rand = new Random();
    private static DecimalFormat fmt = new DecimalFormat("0.###");

    public Student (String newName, String newAddress, String newMajor)
    {
        name = newName;
        address = newAddress;
        major = newMajor;
        computeGPA();
    }

    public Student (String newName, String newAddress)
    {
        name = newName;
        address = newAddress;
        major = "Undeclard";
        computeGPA();
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    public String getAddress()
    {
        return address;
    }

    public void setMajor(String newMajor)
    {
        major = newMajor;
    }

    public String getMajor()
    {
        return major;
    }

    public double getGPA()
    {
        return GPA;
    }

    public void computeGPA()
    {
        GPA = 0.5 + (rand.nextDouble() * 3.5);
    }

    public String toString() {
        String result = "";
        result += ("Name: " + name + "\n");
        result += ("Address: " + address + "\n");
        result += ("Major: " + major + "\n");
        result += ("GPA: " + fmt.format(GPA) + "\n");
        return result;
    }

    @Override
    public int compareTo(Student a) {
        if (this.name.equals(a.name)){
            if (this.address.equals(a.address)){
                if (this.major.equals(a.major)){
                    if (this.GPA==a.GPA)
                        return 0;
                    else
                        return -4;
                }
                else
                    return -3;
            }
            else
                return -2;
        }
        return -1;
    }

}
