package com.group63.Restaurant_booking.system.Repositories;

import com.group63.Restaurant_booking.system.Entity.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RestaurantRepo extends JpaRepository<Restaurants, Integer> {

    Optional<Restaurants> findByRestaurantID(Integer restaurantID); // Maps to the restaurantID field in the entity

}
