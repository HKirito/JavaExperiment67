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
        double rebalance = amount;
        if (isDiscount){
            rebalance = amount -10;
            isDiscount = false;
        }
        if (amount>=100){
            isDiscount = true;
        }
        Balance = rebalance + Balance;
    }

    @Override
    public String toString() {
        return "CustomerA{" +
                "Balance=" + Balance +
                '}';
    }
}
