package org.fasttrackit;

import java.time.LocalDate;

public class Food {
    private String name;
    private double price;
    private double quantity;
    private LocalDate year;

    boolean availability;
    public Food(String name, double price, double quantity, LocalDate year, boolean availability) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.year = year;
        this.availability = availability;
    }

}






