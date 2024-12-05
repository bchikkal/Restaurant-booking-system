package com.group63.Restaurant_booking.system.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.management.Notification;
import java.util.*;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/")
@Controller
public class HomeController {


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
    public String notificationsPage() {
        return "notifications"; // notifications.html
    }

}
