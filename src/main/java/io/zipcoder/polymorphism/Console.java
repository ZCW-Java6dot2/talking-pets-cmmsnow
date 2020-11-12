package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    private Scanner scan = new Scanner(System.in);
    private Integer numberOfPets;
    private String[] typeOfPet;
    private String[] petsNames;

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scan.nextLine();
    }

    public Integer getNumberOfPets(){
        System.out.println("How many pets do you have?");
        numberOfPets = scan.nextInt();
        return numberOfPets;
    }

    public void getTypeOfPets(Integer numberOfPets){
        if (numberOfPets == 1) {
            typeOfPet = new String[1];
            typeOfPet[0] = getInput("Enter the type of animal.");
        } else if (numberOfPets > 1){
            typeOfPet = new String[numberOfPets];
            typeOfPet[0] = getInput("Enter the type of animal for your first pet.");
            for (int i=1; i<numberOfPets; i++){
                typeOfPet[i] = getInput("Enter the type of animal for your next pet");
            }
        }
    }

    public void getPetsNames(Integer numberOfPets){
        if (numberOfPets == 1) {
            petsNames = new String[1];
            petsNames[0] = getInput("Enter your pet's name.");
        } else if (numberOfPets > 1){
            typeOfPet = new String[numberOfPets];
            petsNames[0] = getInput("Enter your first pet's name.");
            for (int i=1; i<numberOfPets; i++){
                petsNames[i] = getInput("Enter your next pet's name.");
            }
        }
    }

    public void printListOfPets(){
        System.out.println("List of your " + numberOfPets + " pets:\n");
        for (int i = 0; i < typeOfPet.length; i++) {
            System.out.println(petsNames[i] + " is a " + typeOfPet[i] + "\n");
        }
    }
}
