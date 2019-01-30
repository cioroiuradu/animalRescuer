package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Food food3 = new Food();
        food.setName("1 - Sausage");
        availableFood.add(food);
        food2.setName("2 - Pizza");
        availableFood.add(food2);
        food3.setName("3 - Apfel Strudel");
        availableFood.add(food3);


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
            System.out.println(availableFood.get(i).getName());
        }
    }


    public void initAnimal() {
        System.out.println("Please choose your pet: (dor or cat) ");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        String chosenAnimal = scanner.next();
        if(chosenAnimal.equals("dog")) {
            System.out.println("The chosen pet is: " + chosenAnimal);
        } else {
            if (chosenAnimal.equals("cat")) {
                System.out.println("The chosen pet is: " + chosenAnimal);
            } else {
                System.out.println("Please try again !");
                initAnimal();
            }
        }


     }

     public static boolean isNumeric(String str) {
        for(char c : str.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return true;
     }

     public void initRescuer() {
         System.out.println("Please enter your name: ");
        Adopter adopter = new Adopter();
        Scanner scanner = new Scanner(System.in);
        String adopterName = scanner.next();
        adopter.setName(adopterName);

        if(!isNumeric(adopterName))
            System.out.println("Your name is: " + adopter.getName());
        else {
            System.out.println("Please try again!");
            initRescuer();
        }
     }

    private void nameAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose a name for your pet: ");
        String animalName = scanner.next();
        System.out.println("Your animal name is: " + animalName);

    }

    private void requireFeeding() {
        System.out.println("Please choose a food type for your pet from the above list: " + "or type another food type");
        displayFood();
        Scanner scanner = new Scanner(System.in);
        String userInputFood = scanner.next();

        if(userInputFood.equals("1") || userInputFood.equals("2") || userInputFood.equals("3")) {

        if (userInputFood.equals("1")) {
            System.out.println("Your chosen food is: Sausage");
        }
        if (userInputFood.equals("2")) {
            System.out.println("Your chosen food is: Pizza");
        }
        if (userInputFood.equals("3")) {
            System.out.println("Your chosen food is: Apfel Strudel");
        }
        } else {
            Food food = new Food();
            initFood();
            food.setName(userInputFood);
            availableFood.add(food);
            System.out.println("The chosen food is: " + userInputFood);
        }
    }



    public void start() throws Exception {
        initActivities();
//        displayFood();
        displayActivies();
        initAnimal();
        initRescuer();
        nameAnimal();
        initFood();
        requireFeeding();

    }
    public void displayActivies() {
        for (Hobby hobby: availableActivities) {
            if (hobby != null) {
                System.out.println("The available activities are: " + hobby.getName());
            }

        }

    }
   }

