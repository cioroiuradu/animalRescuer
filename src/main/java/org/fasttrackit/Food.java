package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    String name;
    double price;
    double quantity;
    public LocalDate year;

    boolean availability;
    public Food(String name, double price, double quantity, LocalDate year, boolean availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.year = year;
        this.availability = availability;
    }

}






