package com.group63.Restaurant_booking.system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.management.Notification;
import java.util.*;
import org.springframework.web.servlet.ModelAndView;

import com.group63.Restaurant_booking.system.Entity.Users;
import com.group63.Restaurant_booking.system.Services.NotificationService;
import com.group63.Restaurant_booking.system.Services.RestaurantService;
import com.group63.Restaurant_booking.system.Services.UserService;

@RequestMapping("/")
@Controller
public class HomeController {

    @Autowired
    public NotificationService notificationService;

    @Autowired
    public UserService userService;

    @Autowired
    public RestaurantService restaurantService;

    @GetMapping("/")
    public String showDashboard(Model model) {
        model.addAttribute("user", Map.of("name", "Junichi"));
        return "dashboard";
    }

    @GetMapping("/restaurants")
    public String restaurantsPage() {
        return "restaurants"; // restaurants.html
    }

    @GetMapping("/bookings")
    public String bookingsPage() {
        return "bookings"; // bookings.html
    }

    @GetMapping("/notifications")
    public String notificationsPage(Model model) {
        System.out.println(restaurantService.getAllRestaurants().get(0).toString());
        // Users u = userService.getUsersByName("Junichi").get(0);
        model.addAttribute("user", Map.of("name", "Junichi"));
        model.addAttribute("notifications", notificationService.getNotificationsByUserID(1));
        return "notifications"; // notifications.html
    }
}
