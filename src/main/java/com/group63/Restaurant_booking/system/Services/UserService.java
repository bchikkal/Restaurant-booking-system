package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Users;
import com.group63.Restaurant_booking.system.Repositories.UserRepo;
import com.group63.Restaurant_booking.system.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class UserService implements UserServiceImpl{

    @Autowired
    private UserRepo userrepo ;
    @Override
    public List<Users> getUsersByName(String Name) {
        return userrepo.findByName(Name);
    }

    @Override
    public Optional<Users> getUserByID(Integer UserID) {
        return userrepo.findById(UserID);
    }

    @Override
    public Users saveUser(Users user) {
        return userrepo.save(user);
    }
}
