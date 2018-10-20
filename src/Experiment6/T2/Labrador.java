package Experiment6.T2;

public class Labrador extends Dog{
    private String color;
    private static int breadWeight =75;

    public Labrador(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String speak(){
        return "WOOF";
    }

    public static int avgBreedWeight(){
        return breadWeight;
    }



}
