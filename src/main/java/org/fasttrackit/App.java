package org.fasttrackit;

import java.time.LocalDate;
import java.lang.String;


public class App 
{
    public static void main( String[] args ) {

    Animal firstAnimal = new Animal("Costica", 3, 9,10,7,"Steak","Ball chasing");
    firstAnimal.name = "Costica";
    firstAnimal.age = 3;
    firstAnimal.healthLevel = 9;
    firstAnimal.hungerLevel = 10;
    firstAnimal.moodLevel = 7;
    firstAnimal.favouriteFood = "Steak";
    firstAnimal.hobby = "Ball chasing";

    Adopter firstAdopter = new Adopter("George", 500);
    firstAdopter.name = "George";
    firstAdopter.moneyAmount = 500;

    Food firstFood = new Food("Steak",15,3, LocalDate.of(2020,12,31),true);
    firstFood.name = "Steak";
    firstFood.price = 15;
    firstFood.quantity = 3;
    LocalDate year;
    firstFood.availability = true;


    Hobby firstHobby = new Hobby("Ball Chasing");
    firstHobby.name = "Ball Chasing";

    Vet firstVet = new Vet("Ion","Surgery");
    firstVet.name = "Ion";
    firstVet.studyField = "Surgery";

    Game firstGame = new Game("Radu","Gigel","Antonescu");
    firstAdopter.name = "Radu";
    firstAnimal.name = "Gigel";
    firstVet.name = "Antonescu";

    }
}
