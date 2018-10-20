package Experiment11.T1;

public class Labrador extends Dog {
    private String color;
    private static int breadWeight =75;

    public Labrador(String name, String color){
        this.name = name;
        this.color = color;
    }
    public Labrador(){
    }

    public String speak(){
        return "WOOF";
    }

    public static int avgBreedWeight(){
        return breadWeight;
    }



}
