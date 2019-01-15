package org.fasttrackit;


public class Animal {
    //    instance variables(declared as properties of a class
//    they receive default values (null for objects, 0 for numbers, false for booleans)
    String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int moodLevel;
    String favouriteFood;
    String hobby;

    public Animal(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood, String hobby) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.favouriteFood = favouriteFood;
        this.hobby = hobby;
    }
}



