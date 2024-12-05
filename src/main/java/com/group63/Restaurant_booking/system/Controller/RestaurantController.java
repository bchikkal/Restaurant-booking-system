package com.group63.Restaurant_booking.system.Controller;

import com.group63.Restaurant_booking.system.Entity.Restaurants;
import com.group63.Restaurant_booking.system.Services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/restaurants/management")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    // API to get a restaurant by ID (for backend/JSON use)
    @GetMapping("/user/{restaurantID}")
    @ResponseBody
    public Optional<Restaurants> getRestaurantByID(@PathVariable Integer restaurantID) {
        return restaurantService.getRestaurantByID(restaurantID);
    }

    // Save a restaurant via API (for backend/JSON use)
    @PostMapping("/save")
    @ResponseBody
    public Restaurants saveRestaurant(@RequestBody Restaurants restaurant) {
        return restaurantService.saveRestaurants(restaurant);
    }

    // View all restaurants (Thymeleaf integration)
    // View all restaurants (Thymeleaf integration)
    @GetMapping
    public String viewAllRestaurants(Model model) {
        List<Restaurants> restaurants = restaurantService.getAllRestaurants();
        model.addAttribute("restaurants", restaurants);
        return "restaurants"; // Points to restaurants.html in templates folder
    }

    // Search Restaurant by ID (Thymeleaf integration)
    @GetMapping("/search")
    public String searchRestaurantById(@RequestParam("id") Integer restaurantID, Model model) {
        System.out.println("Searching for restaurant with ID: " + restaurantID);
        Optional<Restaurants> restaurant = restaurantService.getRestaurantByID(restaurantID);

        if (restaurant.isEmpty()) {
            System.out.println("No restaurant found with ID: " + restaurantID);
            model.addAttribute("error", "No restaurant found with ID " + restaurantID);
            return "restaurants"; // Return to main page if not found
        }

        System.out.println("Restaurant found: " + restaurant.get());
        model.addAttribute("restaurant", restaurant.get());
        return "restaurantDetails"; // Render the restaurantDetails.html template
    }


    // Delete a restaurant by ID
    @PostMapping("/delete/{id}")
    public String deleteRestaurantById(@PathVariable Integer id) {
        restaurantService.deleteRestaurantById(id); // Ensure delete logic is in the service
        return "redirect:/restaurants/management"; // Redirect to the main page to refresh the list
    }

    // Add a restaurant through a form (Thymeleaf integration)
    @PostMapping("/add")
    public String addRestaurant(Restaurants restaurant) {
        restaurantService.saveRestaurants(restaurant); // Save the restaurant entity
        return "redirect:/restaurants/management"; // Redirect to the main page to display updated list
    }
}
