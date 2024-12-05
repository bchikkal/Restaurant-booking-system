package com.group63.Restaurant_booking.system.Services;

import com.group63.Restaurant_booking.system.Entity.Restaurants;
import com.group63.Restaurant_booking.system.Repositories.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService implements RestaurantServiceImpl {

    @Autowired
    private RestaurantRepo restaurantRepo;

    @Override
    public Optional<Restaurants> getRestaurantByID(Integer restaurantID) {
        return restaurantRepo.findByRestaurantID(restaurantID);
    }

    @Override
    public Restaurants saveRestaurants(Restaurants restaurant) {
        return restaurantRepo.save(restaurant);
    }

    @Override
    public List<Restaurants> getAllRestaurants() {
        return restaurantRepo.findAll();
    }

    @Override
    public void deleteRestaurantById(Integer restaurantID) {
        if (restaurantRepo.existsById(restaurantID)) {
            restaurantRepo.deleteById(restaurantID);
        } else {
            throw new IllegalArgumentException("Restaurant with ID " + restaurantID + " does not exist.");
        }
    }
}
