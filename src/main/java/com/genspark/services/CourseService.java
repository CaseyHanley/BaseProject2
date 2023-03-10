package com.genspark.services;

import com.genspark.entity.Course;
import com.genspark.factory.CourseFactory;
import com.genspark.factory.CourseJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CourseFactory {

    @Autowired
    private CourseJPA courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourse(int id) {
        return courseDao.findById(id);
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public String deleteCourse(int course) {
         courseDao.deleteById(course);
         return "Course Removed";

    }
}
