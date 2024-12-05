package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;
import java.util.Optional;


public interface UserServiceImpl {

List <Users> getUsersByName (String Name) ;

Optional <Users> getUserByID(Integer UserID) ;

Users saveUser(Users user) ;



}
