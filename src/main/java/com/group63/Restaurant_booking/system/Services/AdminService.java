package com.group63.Restaurant_booking.system.Services;
import com.group63.Restaurant_booking.system.Entity.Admin;
import java.util.List;
import java.util.Optional;
import com.group63.Restaurant_booking.system.Repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AdminService implements AdminServiceImpl{

    @Autowired
    private AdminRepo adminrepo ;

    @Override
    public List<Admin> getAllAdmins() {
      return    adminrepo.findAll();
    }

    @Override
    public Optional<Admin> getAdminByID(Integer ID) {
        return adminrepo.findById(ID) ;
    }

    @Override
    public Admin SaveAdmin(Admin admin) {
        return adminrepo.save(admin) ;
    }

    @Override
    public void DeleteAdmin(Integer ID) {
      adminrepo.deleteById(ID);
    }
}
