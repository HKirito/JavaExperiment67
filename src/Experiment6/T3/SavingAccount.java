package Experiment6.T3;

public class SavingAccount extends Account {
    private double InterestRate;

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double interestRate) {
        InterestRate = interestRate;
    }

    public void CaculateAccount(){
        super.setAccountBalance(
                getAccountBalance()*(1+(getInterestRate()/12))
        );
    }

    public SavingAccount(){

    }

    @Override
    public String toString() {
        System.out.print("Rate is :"+getInterestRate()+" ");
        return super.toString();
    }

    @Override
    public void withdraw(double balance) {
        if (balance - getAccountBalance()<0){
            System.out.println("Refuse Operation !(Your money too less)");
            return;
        }else {
            setAccountBalance(getAccountBalance()-balance);
            System.out.println("Operation succeed!"+this.toString());
        }
    }
}
