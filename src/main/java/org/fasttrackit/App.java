package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.lang.String;


public class App 
{
    public static void main( String[] args ) {

    Animal firstAnimal = new Animal();
    firstAnimal.name = "Costica";
    firstAnimal.age = 3;
    firstAnimal.healthLevel = 9;
    firstAnimal.hungerLevel = 10;
    firstAnimal.moodLevel = 7;
    firstAnimal.favouriteFood = "Steak";
    firstAnimal.hobby = "Ball chasing";

    Adopter firstAdopter = new Adopter();
    firstAdopter.name = "George";
    firstAdopter.moneyAmount = 500;

    Food firstFood = new Food();
    firstFood.name = "Steak";
    firstFood.quantity = 3;
    LocalDate year;
    firstFood.availability = true;


    Hobby firstHobby = new Hobby();
    firstHobby.name = "Ball Chasing";

    Vet firstVet = new Vet();
    firstVet.name = "Ion";
    firstVet.studyField = "Surgery";

    Game firstGame = new Game();
    firstAdopter.name = "Radu";
    firstAnimal.name = "Cat";
    firstVet.name = "Antonescu";

    }
}
