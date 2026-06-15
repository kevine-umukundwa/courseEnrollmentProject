package com.university;

import com.university.config.AppConfig;
import com.university.model.Course;
import com.university.model.Student;
import com.university.service.CourseService;
import com.university.service.EnrollmentService;
import com.university.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CourseService courseService = context.getBean(CourseService.class);
        StudentService studentService = context.getBean(StudentService.class);
        EnrollmentService enrollmentService = context.getBean(EnrollmentService.class);

        System.out.println("COURSE & ENROLLMENT SYSTEM \n");

        System.out.println("Adding Courses");
        Course course1 = courseService.createCourse(new Course(1, "Java", 10));
        Course course2 = courseService.createCourse(new Course(2, "Networking", 8));
        Course course3 = courseService.createCourse(new Course(3, "Multimedia", 7));
        System.out.println( course1);
        System.out.println( course2);
        System.out.println( course3);


        System.out.println("\nAdding Students ");
        Student student1 = studentService.createStudent(new Student(101, "Kevine Umukundwa", "kevine@gmail.com"));
        Student student2 = studentService.createStudent(new Student(102, "Kennedy Mugisha", "kennedy@gmail.com"));
        System.out.println( student1);
        System.out.println( student2);


        System.out.println("\n Processing Enrollments ");
        boolean enroll1 = enrollmentService.enrollStudent(101, 1);
        boolean enroll2 = enrollmentService.enrollStudent(101, 2);
        boolean enroll3 = enrollmentService.enrollStudent(102, 1);
        boolean enroll4 = enrollmentService.enrollStudent(102, 3);
        boolean enroll5 = enrollmentService.enrollStudent(999, 1); // Invalid student

        System.out.println("Kevine -> Java: " + (enroll1 ? "SUCCESS" : "FAILED"));
        System.out.println("Kevine  -> Networking: " + (enroll2 ? "SUCCESS" : "FAILED"));
        System.out.println("Kennedy -> Networking: " + (enroll3 ? "SUCCESS" : "FAILED"));
        System.out.println("Kennedy -> Multimedia: " + (enroll4 ? "SUCCESS" : "FAILED"));
        System.out.println("Invalid Student -> Java: " + (enroll5 ? "SUCCESS" : "FAILED"));


        System.out.println("\n All Enrollments ");
        enrollmentService.getAllEnrollments().forEach(System.out::println);


    }
}