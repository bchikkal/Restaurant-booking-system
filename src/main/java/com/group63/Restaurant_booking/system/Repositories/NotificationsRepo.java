package com.group63.Restaurant_booking.system.Repositories;
import com.group63.Restaurant_booking.system.Entity.Notifications;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface NotificationsRepo extends JpaRepository<Notifications, Integer> {

    List <Notifications> findByUserID (Integer UserID) ;
    void deleteByStatus(String Status) ;
}
