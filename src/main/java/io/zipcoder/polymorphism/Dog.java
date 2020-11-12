package io.zipcoder.polymorphism;

public class Dog extends Pet {
    String name;

    public Dog(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String speak() {
        return "Woof";
    }
}
