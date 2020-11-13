package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {
    @Test
    public void constructorTest(){
        String name = "Dexter";
        Dog dog = new Dog(name);
        String actual = dog.getName();
        Assert.assertEquals(name, actual);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat("Booboo");
        String newName = "Toby";
        cat.setName(newName);
        String actual = cat.getName();
        Assert.assertEquals(newName, actual);
    }

    @Test
    public void speakTest(){
        Bunny bunny = new Bunny("Booboo");
        String expected = "Quiet sniff with nose twitches";
        String actual = bunny.speak();
        Assert.assertEquals(expected, actual);
    }
}
