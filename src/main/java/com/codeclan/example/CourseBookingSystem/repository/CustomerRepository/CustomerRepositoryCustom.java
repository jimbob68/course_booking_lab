package com.codeclan.example.CourseBookingSystem.repository.CustomerRepository;

import com.codeclan.example.CourseBookingSystem.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomersByCourse(Long id);
}
