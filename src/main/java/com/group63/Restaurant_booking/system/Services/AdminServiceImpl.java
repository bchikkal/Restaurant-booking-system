package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Admin;
import java.util.List;
import java.util.Optional;


public interface AdminServiceImpl {

    List<Admin> getAllAdmins() ;
    Optional<Admin> getAdminByID(Integer ID) ;

    Admin SaveAdmin(Admin admin);
    void DeleteAdmin(Integer ID) ;

}
