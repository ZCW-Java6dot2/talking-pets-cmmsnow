package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Console {
    private Scanner scan = new Scanner(System.in);
    private Integer numberOfPets;
    private String type;
    private String name;
    //private ArrayList<Pet> pets = new ArrayList<Pet>();

    public String getInput(String prompt) {
        System.out.print(prompt);
        scan.nextLine();
        return scan.next();
    }

    public Integer getNumberOfPets(){
        System.out.println("How many pets do you have?");
        numberOfPets = scan.nextInt();
        return numberOfPets;
    }

    public ArrayList<Pet> getPets(Integer numberOfPets){
        ArrayList<Pet> newPets = new ArrayList<Pet>();
        for (int i=0; i<numberOfPets; i++){
            type = (getInput("Enter the type of animal for your pet:  ")).toLowerCase();
            name = (getInput("Enter this pet's name:  "));
            if (type.equals("dog")){
                Dog dog = new Dog(name);
                newPets.add(dog);
            } else if (type.equals("cat")){
                Cat cat = new Cat(name);
                newPets.add(cat);
            } else if (type.equals("bunny")){
                Bunny bunny = new Bunny(name);
                newPets.add(bunny);
            }
        }
        return newPets;
    }

    public void printListOfPets(ArrayList<Pet> rPets){
        System.out.println("List of your " + rPets.size() + " pets:\n");
        for (Pet p : rPets){
            System.out.println("\n" + (p.getName()) + " says " + (p.speak()));
        }
    }
}
