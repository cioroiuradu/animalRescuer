package org.fasttrackit;

public class Cat extends Pet {
    private boolean purr;

//    public Cat(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood, String hobby, boolean inDoor, boolean meow) {
//        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, hobby, inDoor);
//        this.meow = meow;
//    }

    @Override
    public void showMoodLevel(Animal moodLevel){
        System.out.println(getName() + "'s mood level is: " + moodLevel.getMoodLevel());
    }

}
