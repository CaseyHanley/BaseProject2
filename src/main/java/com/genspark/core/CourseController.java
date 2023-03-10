package com.genspark.core;

import com.genspark.entity.Course;
import com.genspark.services.CourseService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    @Resource(name="courseService")
    private CourseService courseService;

    @GetMapping("/course")
    private List<Course> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("/course/{courseNum}")
    public Optional<Course> getCourseFromNum(@PathVariable int courseNum){

        return courseService.getCourse(courseNum);
    }

    @PutMapping("/course")
    public Course addCourse(@RequestBody Course course){

        return courseService.addCourse(course);
    }



}
