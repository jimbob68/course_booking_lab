package com.codeclan.example.CourseBookingSystem.components;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import com.codeclan.example.CourseBookingSystem.models.Course;
import com.codeclan.example.CourseBookingSystem.models.Customer;
import com.codeclan.example.CourseBookingSystem.repository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

  @Autowired
    BookingRepository bookingRepository;

  @Autowired
    CustomerRepository customerRepository;

  @Autowired
    CourseRepository courseRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Stephen", "Perth", 35);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Cody", "Linlithgow", 40);
        customerRepository.save(customer2);

        Course course1 = new Course("Professional Software Development", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Advanced Ballet", "Dunfermline", 5);
        courseRepository.save(course2);

        Booking booking1 = new Booking("22-07-20", customer1, course2);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("23-03-19",customer2, course1);
        bookingRepository.save(booking2);



//        customer1.addBooking(booking1);
//        customer1.addBooking(booking2);
//        customerRepository.save(customer1);
//
//        customer2.addBooking(booking2);
//        customerRepository.save(customer2);


    }

}
