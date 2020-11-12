package io.zipcoder.polymorphism;

public class MainApplication {
    public static void main(String[] args){
        Console console = new Console();
        Integer numOfPets = console.getNumberOfPets();
        console.getTypeOfPets(numOfPets);
        console.getPetsNames(numOfPets);
        console.printListOfPets();
    }
}
