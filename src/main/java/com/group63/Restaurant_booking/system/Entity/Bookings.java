package com.group63.Restaurant_booking.system.Entity;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table (name = "Bookings")
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer BookingID;

    private Integer userID;

    private Integer restaurantID;

    private LocalDate date ;

    private LocalTime Time;

    private Integer   NumberOfPeople;

    private String status;

    private Integer AdminID;

     public Bookings() { }

    public Bookings (Integer UserID, Integer RestaurantID, LocalDate Date, LocalTime Time, Integer NumberOfPeople, String Status, Integer AdminID ) {
      this.userID = UserID;
      this.restaurantID = RestaurantID;
      this.date= Date;
      this.Time = Time;
      this.NumberOfPeople= NumberOfPeople;
      this.status = Status;
      this.AdminID= AdminID;
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
        return restaurantID;
    }

    public void setRestaurantID(Integer restaurantID) {
        this.restaurantID = restaurantID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return Time;
    }

    public void setTime(LocalTime time) {
        this.Time = time;
    }

    public Integer getNumberOfPeople() {
        return NumberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.NumberOfPeople = numberOfPeople;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAdminID() {
        return AdminID;
    }

    public void setAdminID(Integer adminID) {
        this.AdminID = adminID;
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "BookingID=" + BookingID +
                ", UserID=" + userID +
                ", RestaurantID=" + restaurantID +
                ", Date=" + date +
                ", Time=" + Time +
                ", NumberOfPeople=" + NumberOfPeople +
                ", Status='" + status + '\'' +
                ", AdminID=" + AdminID +
                '}';
    }


}
