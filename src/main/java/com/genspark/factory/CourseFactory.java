package com.genspark.factory;

import com.genspark.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseFactory {

List<Course> getCourses();
Optional<Course> getCourse(int id);
Course addCourse(Course course);
Course updateCourse(Course course);
String deleteCourse(int course);

}
