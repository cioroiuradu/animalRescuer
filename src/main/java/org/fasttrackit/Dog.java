package org.fasttrackit;

public class Dog extends Pet {
    private boolean barking;

    public boolean isBarking() {
        return barking;
    }

    public void setBarking(boolean barking) {
        this.barking = barking;
    }
    @Override
    public void showMoodLevel(Animal moodLevel){
        System.out.println(getName() + "'s mood level is: " + moodLevel.getMoodLevel());
    }

}
