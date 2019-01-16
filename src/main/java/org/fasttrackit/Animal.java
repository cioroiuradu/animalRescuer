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

//    public Animal(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood, String hobby) {
//        this.name = name;
//        this.age = age;
//        this.healthLevel = healthLevel;
//        this.hungerLevel = hungerLevel;
//        this.moodLevel = moodLevel;
//        this.favouriteFood = favouriteFood;
//        this.hobby = hobby;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = moodLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }



    public void showMoodLevel(int moodLevel){
        System.out.println("Mood level is: " + moodLevel);
    }


}



