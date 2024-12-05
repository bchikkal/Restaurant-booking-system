package com.group63.Restaurant_booking.system.Services;

import com.group63.Restaurant_booking.system.Entity.Bookings;
 import com.group63.Restaurant_booking.system.Entity.Bookings;
import  com.group63.Restaurant_booking.system.Repositories.BookingsRepo;
import com.group63.Restaurant_booking.system.Services.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class BookingService implements BookingServiceImpl {
    @Autowired
   private  BookingsRepo bookrepo ;

    @Override
    public List<Bookings> getBookingsByUserID(Integer UserID) {
        return bookrepo.findByUserID(UserID) ;
    }

    @Override
    public List<Bookings> getUpcomingBookings(Integer RestaurantID, LocalDate date) {
        return bookrepo.findByRestaurantIDAndDateAfterOrderByDate(RestaurantID, date);
    }

    @Override
    public List<Bookings> getBookingsByStatus(String status) {
        return bookrepo.findByStatus(status) ;
    }

    @Override
    public Bookings saveBookings(Bookings booking) {
        return bookrepo.save(booking);
    }

    @Override
    public void cancelBookings(Integer bookingID) {
      bookrepo.deleteById(bookingID);
    }
}
