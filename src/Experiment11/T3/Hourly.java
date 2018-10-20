package Experiment11.T3;

public class Hourly extends Employee{
    private int HoursWorked;

    public int getHoursWorked() {
        return HoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        HoursWorked = hoursWorked;
    }

    public void AddHours(int MoreHours){

    }

    public double pay(){
        return super.pay();
    }

    public Hourly(String name, String address,String phone,String social,double PayRate,int hoursWorked){
        super(name,address,phone,social,PayRate);
        HoursWorked = hoursWorked;

    }

    @Override
    public String toString() {
        return super.toString()+"\nWorkedHour :"+getHoursWorked();
    }
}
