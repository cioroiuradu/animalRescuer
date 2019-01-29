package org.fasttrackit;

import java.time.LocalDate;


public class Food {
    protected String name;
    protected double price;
    protected double quantity;
    protected LocalDate year;
    boolean availability;




//    public Food(String name, double price, double quantity, LocalDate year, boolean availability) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//        this.year = year;
//        this.availability = availability;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

}






