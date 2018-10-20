package Experiment7.T7;

public class Customer {
    private double Balance = 0;
    private boolean isDiscount = false;

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void makePurchase(double amount){
        if (!isDiscount){

            if ((Balance+amount)/100-Balance>0)
                isDiscount = true;
            Balance = Balance + amount;
        }
        Balance = Balance + amount -10;

    }
    public boolean discountReached(){
        return true;
    }
}
