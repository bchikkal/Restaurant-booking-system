package com.group63.Restaurant_booking.system.Controller;
import com.group63.Restaurant_booking.system.Entity.Bookings;
import com.group63.Restaurant_booking.system.Repositories.BookingsRepo;
import com.group63.Restaurant_booking.system.Services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.time.LocalDate;


@RestController

@RequestMapping("/bookings")
public class BookingsController {

    @Autowired BookingService bookingService ;

    @GetMapping("/user/{userID}")
    public ResponseEntity<List<Bookings>> getBookingsByuserID(@PathVariable Integer userID) {

        return ResponseEntity.ok(bookingService.getBookingsByUserID(userID));

    }

   @GetMapping("/upcoming?RestaurantID=X&time=Y")
    public ResponseEntity<List<Bookings>>getUpcomingBookings (@RequestParam Integer RestaurantID, @RequestParam LocalDate time) {

     return ResponseEntity.ok(bookingService.getUpcomingBookings(RestaurantID, time));
   }

   @GetMapping("/status/{Status}")
     public ResponseEntity<List<Bookings>> getBookingByStatus(@PathVariable String Status) {
       System.out.println("Received Status: " + Status);
     return ResponseEntity.ok(bookingService.getBookingsByStatus(Status)) ;


   }

   @PostMapping("/save")
   public  ResponseEntity SaveBookings(@RequestBody Bookings bookings ) {

        return ResponseEntity.ok(bookingService.saveBookings(bookings)) ;
   }


   @DeleteMapping("/cancel/{BookingID}")

    public ResponseEntity<String> deleteBooking(@PathVariable Integer BookingID ){

        bookingService.cancelBookings(BookingID);

        return ResponseEntity.ok("booking cancelled") ;
   }




}
