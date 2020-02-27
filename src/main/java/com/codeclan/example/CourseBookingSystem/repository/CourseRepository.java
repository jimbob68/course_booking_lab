package com.codeclan.example.CourseBookingSystem.repository;

import com.codeclan.example.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> findCoursesByStarRating(int starRating);
}
