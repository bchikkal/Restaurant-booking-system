package com.group63.Restaurant_booking.system.Services;

import com.group63.Restaurant_booking.system.Entity.Restaurants;

import java.util.List;
import java.util.Optional;

public interface RestaurantServiceImpl {

    Optional<Restaurants> getRestaurantByID(Integer restaurantID);

    Restaurants saveRestaurants(Restaurants restaurant);

    List<Restaurants> getAllRestaurants();

    void deleteRestaurantById(Integer restaurantID);

}
