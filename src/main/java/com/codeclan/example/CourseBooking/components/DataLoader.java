package com.codeclan.example.CourseBooking.components;

import com.codeclan.example.CourseBooking.models.Booking;
import com.codeclan.example.CourseBooking.models.Course;
import com.codeclan.example.CourseBooking.models.Customer;
import com.codeclan.example.CourseBooking.repositories.BookingRepository;
import com.codeclan.example.CourseBooking.repositories.CourseRepository;
import com.codeclan.example.CourseBooking.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) throws Exception {


        Course course1 = new Course("JavaScript for Dummies", "Glasgow", 5);
        courseRepository.save(course1);
        Course course2 = new Course("Java for Dummies", "Glasgow", 5);
        courseRepository.save(course2);
        Course course3 = new Course("Ruby for Dummies", "Edinburgh", 2);
        courseRepository.save(course3);
        Customer customer1 = new Customer("Alex", "Barrhead", 28);
        customerRepository.save(customer1);
        Customer customer2 = new Customer ("Kira", "Helensburgh", 33);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Jack", "Paisley", 25);
        customerRepository.save(customer3);
        Booking booking1 = new Booking("11/06/20", course1, customer1);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking ("10/06/20", course1, customer2);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking ("09/06/20", course2, customer1);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking ("05/06/20", course3, customer3);
        bookingRepository.save(booking4);

    }
}
