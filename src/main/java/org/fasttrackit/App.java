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

    firstAdopter.feeding(firstAnimal, firstFood);
    firstAdopter.recreation(firstAnimal, firstHobby);

    }
}
