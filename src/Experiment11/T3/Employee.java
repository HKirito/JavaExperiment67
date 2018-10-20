package Experiment11.T3;

public class Employee extends StaffMember{
    private String socialSecurityNumber;
    private double payRate;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double pay(){
        return payRate;
    }

    public Employee(String name, String address,String phone,String social,double PayRate){
        super(name,address,phone);
        socialSecurityNumber = social;
        payRate = PayRate;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSocialNumber :"+getSocialSecurityNumber();
    }
}
