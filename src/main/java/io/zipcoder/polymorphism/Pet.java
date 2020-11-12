package io.zipcoder.polymorphism;

public class Pet {
    String name;
    String type;

    public Pet(){}

    public Pet(String type, String name){
        this.type = type;
        this.name = name;
    }

    public void addPet(String type, String name){
        this.type = type;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public String speak(){
        return "I'm hella cute";
    }
}
