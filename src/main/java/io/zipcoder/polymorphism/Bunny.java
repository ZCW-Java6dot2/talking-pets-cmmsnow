package io.zipcoder.polymorphism;

public class Bunny extends Pet {
    String name;

    public Bunny(String name){
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
        return "Quiet sniff with nose twitches";
    }
}
