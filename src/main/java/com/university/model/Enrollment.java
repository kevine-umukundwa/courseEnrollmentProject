package com.university.model;

public class Enrollment {
    private int studentId;
    private int courseId;
    private String enrollmentDate;

    public Enrollment() {}

    public Enrollment(int studentId, int courseId, String enrollmentDate) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public int getCourseId() { return courseId; }
    public void setCourseId(int courseId) { this.courseId = courseId; }
    public String getEnrollmentDate() { return enrollmentDate; }
    public void setEnrollmentDate(String enrollmentDate) { this.enrollmentDate = enrollmentDate; }

    @Override
    public String toString() {
        return "Enrollment{studentId=" + studentId + ", courseId=" + courseId + ", date='" + enrollmentDate + "'}";
    }
}