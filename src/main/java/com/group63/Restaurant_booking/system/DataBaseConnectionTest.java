package com.group63.Restaurant_booking.system;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class DataBaseConnectionTest {
   private final DataSource dataSource ;
    public DataBaseConnectionTest(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @GetMapping("/test-db-connection")
    public String testConnection() {
        try (Connection connection = dataSource.getConnection()) {
            return "Database connection successful!";
        } catch (Exception e) {
            return "Database connection failed: " + e.getMessage();
        }
    }

}
