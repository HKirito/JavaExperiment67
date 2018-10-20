package Experiment11.T3;

public class Commission extends Hourly{
    private double Sum = 0;
    private double PayRate;

    public double getSum() {
        return Sum;
    }

    public void setSum(double sum) {
        Sum = sum;
    }

    public double getPayRate() {
        return PayRate;
    }

    public void setPayRate(double rate) {
        PayRate = PayRate;
    }

    public Commission(String name, String address,String phone,String social,double Payrate,int hoursWorked, double payrate){
        super(name,address,phone,social,Payrate,hoursWorked);
        PayRate =payrate;
    }

    public void addSales(double totalSales){
        Sum += totalSales;
    }

    public double pay(){
        addSales(super.pay()*getHoursWorked());
        addSales(getSum()*(getPayRate()));
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSumSale is "+getSum();
    }
}
