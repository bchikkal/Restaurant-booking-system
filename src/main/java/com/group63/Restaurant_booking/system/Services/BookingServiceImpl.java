package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Bookings;
import java.time.LocalDate;
import java.util.List;

public interface BookingServiceImpl {

    List<Bookings> getBookingsByUserID(Integer UserID) ;
    List<Bookings> getUpcomingBookings(Integer RestaurantID, LocalDate date) ;

    List <Bookings> getBookingsByStatus(String status) ;


    Bookings saveBookings(Bookings booking);

    void cancelBookings(Integer bookingID) ;



}
