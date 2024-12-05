package com.group63.Restaurant_booking.system.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Restaurants\"") // Enclose the table name in quotes to match PostgreSQL's case-sensitive name
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"restaurantID\"") // Use quotes to match the case-sensitive column name
    private Integer restaurantID;

    @Column(name = "\"name\"") // Use quotes for all columns
    private String name;

    @Column(name = "\"address\"")
    private String address;

    @Column(name = "\"numberOfTables\"")
    private Integer numberOfTables;

    @Column(name = "\"phoneNumber\"")
    private String phoneNumber;

    public Restaurants() {}

    public Restaurants(String name, String address, Integer numberOfTables, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.numberOfTables = numberOfTables;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public Integer getRestaurantID() {
        return restaurantID;
    }

    public void setRestaurantID(Integer restaurantID) {
        this.restaurantID = restaurantID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(Integer numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Restaurants{" +
                "restaurantID=" + restaurantID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numberOfTables=" + numberOfTables +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
