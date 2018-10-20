package Experiment6.T2;

public class DogTest {
    public static void main(String[] args){
        Dog dog = new Dog("Spike");
        Labrador labrador = new Labrador("Labrador","blue");
        Yorkshire yorkshire = new Yorkshire("yorkshire");
        System.out.println(dog.getName()+" says "+dog.speak());
        System.out.println(labrador.getName()+" says "+labrador.speak());
        System.out.println(yorkshire.getName()+" says "+yorkshire.speak());
    }
}
