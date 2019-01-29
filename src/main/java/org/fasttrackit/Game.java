package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    protected String name;
    protected String dog;
    protected String vetName;
//    private Adopter adopter;
//    private Animal;
//    private Vet doctor;
    private List<Food> availableFood = new ArrayList<>();
    private Hobby[] availableActivities = new Hobby[5];

//    public Game(String name, String dog, String vetName) {
//        this.name = name;
//        this.dog = dog;
//        this.vetName = vetName;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }


    public void initFood() {

        Food food = new Food();
        Food food2 = new Food();
        food.setName("Sausage");
        availableFood.add(food);
        food2.setName("Pizza");
        availableFood.add(food2);

     }

    public void initActivities(){
        Hobby EntertainmentActivity = new Hobby();
        Hobby EntertainmentActivity2 = new Hobby();
        EntertainmentActivity.setName("Running");
        EntertainmentActivity2.setName("Swimming");

        availableActivities[0] = new Hobby();
        availableActivities[0] = EntertainmentActivity;
        availableActivities[1] = new Hobby();
        availableActivities[1] = EntertainmentActivity2;

    }

    public void displayFood() {
        for(int i = 0; i < availableFood.size(); i++ ) {
            if (availableFood != null)
            System.out.println("The available food options are: " + availableFood.get(i).getName());
        }
    }
    
    public void displayActivies() {
        for (Hobby hobby: availableActivities) {
            if (availableActivities != null) {
                System.out.println("The available activities are: " + hobby.getName());
            }
            
        }

     }
    public void start() {
        initFood();
        initActivities();
        displayFood();
        displayActivies();

    }
   }

