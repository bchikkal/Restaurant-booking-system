package com.group63.Restaurant_booking.system.Repositories;
import com.group63.Restaurant_booking.system.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;


public interface UserRepo extends JpaRepository <Users, Integer>{

    List <Users> findByName(String Name );

}

