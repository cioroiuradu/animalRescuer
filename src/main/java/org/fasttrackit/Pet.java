package org.fasttrackit;

public class Pet extends Animal {
    private boolean inDoor;


//    public Pet(String name, int age, int healthLevel, int hungerLevel, int moodLevel, String favouriteFood, String hobby, boolean inDoor) {
//        super(name, age, healthLevel, hungerLevel, moodLevel, favouriteFood, hobby);
//        this.inDoor = inDoor;
//    }



    public boolean isInDoor() {
        return inDoor;
    }

    public void setInDoor(boolean inDoor) {
        this.inDoor = inDoor;
    }

    @Override
    public void showMoodLevel(Animal moodLevel){
        System.out.println(getName() + "'s mood level is: " + moodLevel.getMoodLevel());
    }

}
