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
    public void showMoodLevel(int moodLevel){
        System.out.println("Dog's mood level is: " + moodLevel);
    }

}
