package org.fasttrackit;


public class Animal {
    //    instance variables(declared as properties of a class
//    they receive default values (null for objects, 0 for numbers, false for booleans)
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favouriteFood;
    private String hobby;

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



