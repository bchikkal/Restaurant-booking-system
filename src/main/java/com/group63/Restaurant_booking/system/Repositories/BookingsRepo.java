package com.group63.Restaurant_booking.system.Repositories;
import com.group63.Restaurant_booking.system.Entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.*;
public interface BookingsRepo extends JpaRepository<Bookings, Integer> {

    List <Bookings> findByUserID(Integer UserID);
    List <Bookings> findByRestaurantIDAndDateAfterOrderByDate(Integer RestaurantID, LocalDate Date);

    List <Bookings> findByStatus(String Status) ;
}
