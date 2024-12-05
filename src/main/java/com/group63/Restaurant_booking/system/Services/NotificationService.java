package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Notifications;
import java.util.List;
import com.group63.Restaurant_booking.system.Repositories.NotificationsRepo;
import com.group63.Restaurant_booking.system.Services.NotificationServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class NotificationService implements NotificationServiceImpl{

    @Autowired
    private NotificationsRepo notificationrepo;

    @Override
    public List<Notifications> getNotificationsByUserID(Integer UserID) {
        return notificationrepo.findByUserID(UserID);
    }

    @Override
    public void deleteNotificationsByStatus(String Status) {
     notificationrepo.deleteByStatus(Status);
    }

    @Override
    public Notifications SaveNotifications(Notifications notifications) {
        return notificationrepo.save(notifications);
    }
}
