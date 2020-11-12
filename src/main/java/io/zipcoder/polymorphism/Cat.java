package io.zipcoder.polymorphism;

public class Cat extends Pet {
    String name;

    public Cat(String name){
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
        return "Meow";
    }
}
