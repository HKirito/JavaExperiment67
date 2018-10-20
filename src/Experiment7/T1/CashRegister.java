package Experiment7.T1;

import java.util.ArrayList;
import java.util.Iterator;

public class CashRegister {


    private ArrayList<Double> CashList;
    private double taxableTotal;
    private double taxRate;

    public ArrayList<Double> getCashList() {
        return CashList;
    }

    public void setCashList(ArrayList<Double> cashList) {
        CashList = cashList;
    }

    public double getTaxableTotal() {
        return taxableTotal;
    }

    public void setTaxableTotal(double taxableTotal) {
        this.taxableTotal = taxableTotal;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public CashRegister(){}

    public CashRegister(double aTaxRate){
        CashList = new ArrayList<Double>();
        taxableTotal = 0;
        taxRate = aTaxRate;
    }

    public void addItem(double price, boolean taxable){
        if (!CashList.isEmpty())
            CashList.add(CashList.get(CashList.size()-1)+price);
        else
            CashList.add(price);
        if (taxable){
            taxableTotal = taxableTotal + price;
        }
    }

    public double getTotal(){
        Double Sum = 0.0;
        while(CashList.iterator().hasNext()){
            Sum = Sum + CashList.iterator().next();
        }
        return Sum + taxableTotal * taxRate / 100;
    }

    public int getCount(){
        return CashList.size();
    }

    public void clear(){
        CashList.clear();
        taxableTotal = 0;
    }

    public void displayAll(){
        Iterator<Double> it = CashList.iterator();
        System.out.println("一共有"+getCount()+"个元素");
        int i = 1;
        while(it.hasNext()){
            Double item = it.next();
            System.out.println("第"+ i +"个元素的值为："+item);
            i++;
        }

    }
    public static void main(String[] args){
        CashRegister cashRegister = new CashRegister(0.6);
        for (int i = 0; i < 5; i++) {
            cashRegister.addItem(10.0,true);
        }
        cashRegister.displayAll();
    }

}
