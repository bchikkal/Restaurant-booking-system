package com.group63.Restaurant_booking.system.Controller;
import com.group63.Restaurant_booking.system.Entity.Users;
import com.group63.Restaurant_booking.system.Repositories.UserRepo;
import com.group63.Restaurant_booking.system.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.* ;

@RestController

@RequestMapping("/users")

public class UserController {

    @Autowired
    private UserService userService ;

    @GetMapping("/user/{Name}") // make sure to put %20 between first and last name for the space

    public ResponseEntity<List<Users>> getUserByName(@PathVariable String Name) {
        System.out.print("Name" + Name);
        return ResponseEntity.ok(userService.getUsersByName(Name)) ;


    }

    @GetMapping("/{userID}")
    public ResponseEntity<Optional<Users>> getUserByID(@PathVariable Integer userID) {

         return ResponseEntity.ok(userService.getUserByID(userID)) ;

    }

    @PostMapping("/save")

    public ResponseEntity<Users> saveUser(@RequestBody Users user){

        return ResponseEntity.ok(userService.saveUser(user));

    }

}
