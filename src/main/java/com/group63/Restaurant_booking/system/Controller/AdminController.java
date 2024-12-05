package com.group63.Restaurant_booking.system.Controller;
import com.group63.Restaurant_booking.system.Entity.Admin;
import com.group63.Restaurant_booking.system.Repositories.AdminRepo;
import com.group63.Restaurant_booking.system.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;



@RestController
@RequestMapping("/admin")

public class AdminController {

  @Autowired
    private AdminService adminService ;

  @GetMapping("/all")
    public ResponseEntity<List<Admin>> getAllAdmins() {
       return  ResponseEntity.ok(adminService.getAllAdmins()) ;

  }


  @GetMapping("/{id}")
  public ResponseEntity<Optional<Admin>> getAdminById(@PathVariable Integer id) {
      Optional<Admin> admin = adminService.getAdminByID(id);
      return admin.isPresent() ? ResponseEntity.ok(admin) : ResponseEntity.notFound().build();
  }

  @PostMapping("/save")
    public ResponseEntity <Admin> saveAdmin (@RequestBody Admin admin ) {
        return ResponseEntity.ok(adminService.SaveAdmin(admin));

  }

   @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAdmin(@PathVariable Integer id ) {

        adminService.DeleteAdmin(id);

        return ResponseEntity.ok("admin deleted");

   }






}
