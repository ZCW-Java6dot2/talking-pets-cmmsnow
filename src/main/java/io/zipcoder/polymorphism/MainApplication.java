package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class MainApplication {
    public static void main(String[] args){
        Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        console.getPets(numOfPets);
        console.printListOfPets();
    }
}
