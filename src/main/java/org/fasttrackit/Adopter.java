package org.fasttrackit;

public class Adopter {
    private String name;
    private double moneyAmount;

//    public Adopter(String name, double moneyAmount) {
//        this.name = name;
//        this.moneyAmount = moneyAmount;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(double moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public void feeding(Animal animal, Food food) {

        System.out.println(animal.getName() + "'s initial mood level is: " + animal.getMoodLevel());
        if(animal.favouriteFood.equals(food.name)) {
            animal.moodLevel ++;
            System.out.println(" Now the mood level is: " + animal.getMoodLevel());
        }
        else System.out.println(" The animal wants his favourite food!!!!! ");


        System.out.println(animal.getName() + "'s initial hunger level is: " + animal.getHungerLevel());
        animal.hungerLevel --;
        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName() +
                " and the hunger level is: " + animal.getHungerLevel());


    }

    public void recreation(Animal animal, Hobby hobby) {
        System.out.println(animal.getName() + "'s initial mood level is: " + animal.getMoodLevel());

        if(animal.hobby.equals(hobby.name)) {
            animal.moodLevel = animal.moodLevel+2;
            System.out.println(" The new mood level after his favourite hobby is: " + animal.getMoodLevel());
        }
        else {
            animal.moodLevel++;
            System.out.println(" The new mood after wrong hobby is: " + animal.getMoodLevel());
        }

        animal.moodLevel ++;
        System.out.println(getName() + " went out with " + animal.getName() + " to " + hobby.getName() +
                " and now the mood level is: " + animal.getMoodLevel());
    }


}


