package com.codeclan.example.CourseBookingSystem.repository.BookingRepository;

import com.codeclan.example.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking, Long> {



}
