package com.genspark.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseID;

    private String courseName;

    private String courseInstructor;

    public Course() {
        courseID = 0;
        courseInstructor = "None";
        courseName = "None";
    }

    public Course(int courseID, String courseName, String courseInstructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.courseInstructor = courseInstructor;
    }


}

