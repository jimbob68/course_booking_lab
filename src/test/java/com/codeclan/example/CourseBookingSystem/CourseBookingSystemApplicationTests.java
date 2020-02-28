package com.codeclan.example.CourseBookingSystem;

import com.codeclan.example.CourseBookingSystem.repository.BookingRepository.BookingRepository;
import com.codeclan.example.CourseBookingSystem.repository.CourseRepository.CourseRepository;
import com.codeclan.example.CourseBookingSystem.repository.CustomerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

}
