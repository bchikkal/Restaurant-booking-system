package com.group63.Restaurant_booking.system.Controller;
import  com.group63.Restaurant_booking.system.Entity.Notifications;
import com.group63.Restaurant_booking.system.Repositories.NotificationsRepo ;
import com.group63.Restaurant_booking.system.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.Notification;
import java.util.*;


@RestController
@RequestMapping("/notifications")

public class NotificationsController {

    @Autowired
 private NotificationService notificationService ;


    @GetMapping("/user/{userID}")
   public ResponseEntity <List<Notifications>> getNotificationsByuserID (@PathVariable Integer userID) {

        List<Notifications> notifications = notificationService.getNotificationsByUserID(userID);
        return ResponseEntity.ok(notifications);


   }


   @DeleteMapping("/status/{Status}")
     public ResponseEntity<String> DeleteNotificationByStatus(@PathVariable String Status){


        notificationService.deleteNotificationsByStatus(Status);

         return ResponseEntity.ok("notification" + Status + "has been deleted " ) ;


   }

    @PostMapping("/save")
    public ResponseEntity<Notifications> saveNotifications(@RequestBody Notifications notification) {
        Notifications savedNotification = notificationService.SaveNotifications(notification);
        return ResponseEntity.ok(savedNotification);
    }







}
