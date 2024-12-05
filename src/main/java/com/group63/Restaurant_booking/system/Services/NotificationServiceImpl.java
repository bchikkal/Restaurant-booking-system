package com.group63.Restaurant_booking.system.Services;

import com.group63.Restaurant_booking.system.Entity.Notifications;

import java.util.List;

public interface NotificationServiceImpl {

    List<Notifications> getNotificationsByUserID(Integer UserID) ;
    void deleteNotificationsByStatus(String Status) ;

    Notifications SaveNotifications(Notifications notifications);

}
