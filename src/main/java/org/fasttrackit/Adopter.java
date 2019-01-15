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
        System.out.println(getName() + " just gave some " + food.getName() + " food to " + animal.getName() );
    }

    public void recreation(Animal animal, Hobby hobby) {
        System.out.println(getName() + " went out with " + animal.getName() + " to " + hobby.getName());
    }


}


