package Experiment7.T4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Country {
    private String CountryName;
    private int CountryPop;
    private int CountrySquare;

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public int getCountryPop() {
        return CountryPop;
    }

    public void setCountryPop(int countryPop) {
        CountryPop = countryPop;
    }

    public int getCountrySquare() {
        return CountrySquare;
    }

    public void setCountrySquare(int countrySquare) {
        CountrySquare = countrySquare;
    }

    public Country(String countryName, int countryPop, int countrySquare) {
        CountryName = countryName;
        CountryPop = countryPop;
        CountrySquare = countrySquare;
    }

    @Override
    public String toString() {
        return "{" +
                "CountryName='" + CountryName + '\'' +
                ", CountryPop=" + CountryPop +
                ", CountrySquare=" + CountrySquare +
                '}';
    }
}
