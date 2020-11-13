package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Console {
    private Scanner scan = new Scanner(System.in);
    private Integer numberOfPets;
    private String type;
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();
    //private Pet[] pets = new Pet[numberOfPets];

    public String getInput(String prompt) {
        System.out.print(prompt);
        scan.next();
        return scan.nextLine();
    }

    public Integer getNumberOfPets(){
        System.out.println("How many pets do you have?");
        numberOfPets = scan.nextInt();
        return numberOfPets;
    }

    public void getPets(Integer numberOfPets){
        for (int i=0; i<numberOfPets; i++){
            type = (getInput("Enter the type of animal for your pet:  ")).toLowerCase();
            name = (getInput("Enter this pet's name:  "));
            if (type == "dog"){
                Dog dog = new Dog(name);
                this.pets.add(dog);
            } else if (type == "cat"){
                Cat cat = new Cat(name);
                this.pets.add(cat);
            } else if (type == "bunny"){
                Bunny bunny = new Bunny(name);
                this.pets.add(bunny);
            }
        }
    }

    public void printListOfPets(){
        System.out.println("List of your " + pets.size() + " pets:\n");
        for (Pet p : pets){
            System.out.println("\n" + (p.getName()) + " says " + (p.speak()));
        }


        /*for (int i = 1; i <= pets.size(); i++) {
            System.out.println("\n" + (pets.indexOf(i)) + " says " + (pet.speak()));
        }*/
    }
}
