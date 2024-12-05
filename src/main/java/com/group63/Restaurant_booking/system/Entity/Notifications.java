package com.group63.Restaurant_booking.system.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "Notifications")
public class Notifications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer NotificationID;

    private Integer BookingID ;

    private Integer userID ;

    private Integer RestaurantID;

    private String status;

    private String Text ;

    public Notifications() {}

    public Notifications( Integer BookingID, Integer UserID, Integer RestaurantID, String Status, String Text) {

        this.BookingID = BookingID ;
        this.userID  = UserID;
        this.RestaurantID= RestaurantID;
        this.status= Status;
        this.Text = Text ;

    }


    public Integer getNotificationID() {
        return NotificationID;
    }

    public void setNotificationID(Integer notificationID) {
        this.NotificationID = notificationID;
    }

    public Integer getBookingID() {
        return BookingID;
    }

    public void setBookingID(Integer bookingID) {
        this.BookingID = bookingID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getRestaurantID() {
        return RestaurantID;
    }

    public void setRestaurantID(Integer restaurantID) {
        this.RestaurantID = restaurantID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        this.Text = text;
    }

    @Override
    public String toString() {
        return "Notifications{" +
                "NotificationID=" + NotificationID +
                ", BookingID=" + BookingID +
                ", UserID=" + userID +
                ", RestaurantID=" + RestaurantID +
                ", Status='" + status + '\'' +
                ", Text='" + Text + '\'' +
                '}';
    }




}
