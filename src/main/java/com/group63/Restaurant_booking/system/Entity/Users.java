package com.group63.Restaurant_booking.system.Entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "\"Users\"")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"UserID\"")
    private Integer UserID;

    @Column(name = "\"name\"")
    private String name;

    @Column(name = "\"PhoneNumber\"")
    private String PhoneNumber;

    @Column(name = "\"Email\"")
    private String Email;

    @Column(name = "\"Password\"")
    private String Password;

    public Users() {
    }

    public Users(String Name, String PhoneNumber, String Email, String Password) {

        this.name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Password = Password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "UserID=" + UserID +
                ", Name='" + name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Users users = (Users) o;
        return UserID.equals(users.UserID) && Email.equals(users.Email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserID, Email);
    }
}
