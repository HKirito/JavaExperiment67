package Experiment11.T1;

public class Dog {
    protected String name;

    public Dog(){}

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String speak(){
        return "Bark";
    }

}
