package Experiment7.T4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountryDrive {
    public static void main(String[] args){
        ArrayList<Country> list = (ArrayList<Country>) Stream.generate( () -> {
            Random random = new Random();
            return new Country("China"+Math.abs(random.nextInt())%10,Math.abs(random.nextInt())%20000,Math.abs(random.nextInt())%20000);
        } )
                .limit(5)
                .collect(Collectors.toList());

        list.forEach(System.out::println);
        Country Pops = list.stream()
                .max(Comparator.comparingInt(Country::getCountryPop))
                .get();
        System.out.println("The Pops Country is :"+Pops.toString());
        Country squarekilm = list.stream()
                .max((x,y) -> (int)(x.getCountrySquare()/x.getCountryPop())-(y.getCountrySquare()/y.getCountryPop()))
                .get();
        System.out.println("The kilom Country is :"+squarekilm.toString());
        Country Maxs = list.stream()
                .max(Comparator.comparingInt(Country::getCountrySquare))
                .get();

        System.out.println("The Squares Country is :"+Maxs.toString());
    }
}
