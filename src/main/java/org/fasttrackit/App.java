package org.fasttrackit;

import java.time.LocalDate;
import java.lang.String;


public class App 
{
    public static void main( String[] args ) {

    Animal firstAnimal = new Animal();
    firstAnimal.setName("Costica");
    firstAnimal.setAge(3);
    firstAnimal.setHealthLevel(9);
    firstAnimal.setHungerLevel(10);
    firstAnimal.setMoodLevel(7);
    firstAnimal.setFavouriteFood("Steak");
    firstAnimal.setHobby("Ball Chasing");

    Adopter firstAdopter = new Adopter();
    firstAdopter.setName("George");
    firstAdopter.setMoneyAmount(500);

    Food firstFood = new Food();
    firstFood.setName("Steak");
    firstFood.setPrice(15);
    firstFood.setQuantity(3);
    firstFood.setYear(LocalDate.of(2020,12,31));
    firstFood.setAvailability(true);


    Hobby firstHobby = new Hobby();
    firstHobby.setName("Ball Chasing");

    Vet firstVet = new Vet();
    firstVet.setName("Ion");
    firstVet.setStudyField("Surgery");

    Game firstGame = new Game();
    firstGame.setName("Radu");
    firstGame.setDog("Gigel");
    firstGame.setVetName("Antonescu");

    firstAnimal.setHungerLevel(9);
    firstAnimal.setMoodLevel(10);
    firstAdopter.feeding(firstAnimal, firstFood);
    firstAdopter.recreation(firstAnimal, firstHobby);

        Animal secondAnimal = new Animal();
        secondAnimal.setName("Loris");
        secondAnimal.setMoodLevel(8);
        secondAnimal.showMoodLevel(secondAnimal);


        Dog firstDog = new Dog();
        firstDog.setName("Busti");
        firstDog.setMoodLevel(10);
        firstDog.showMoodLevel(firstDog);

        Cat firstCat = new Cat();
        firstCat.setName("Aluna");
        firstCat.setMoodLevel(10);
        firstCat.showMoodLevel(firstCat);


    }

}
