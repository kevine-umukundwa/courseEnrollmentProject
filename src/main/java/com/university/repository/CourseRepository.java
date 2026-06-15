package com.university.repository;

import com.university.model.Course;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class CourseRepository {
    private Map<Integer, Course> courseDatabase = new HashMap<>();

    public Course save(Course course) {
        courseDatabase.put(course.getId(), course);
        return course;
    }

    public Optional<Course> findById(int id) {
        return Optional.ofNullable(courseDatabase.get(id));
    }

    public List<Course> findAll() {
        return new ArrayList<>(courseDatabase.values());
    }

    public boolean existsById(int id) {
        return courseDatabase.containsKey(id);
    }
}