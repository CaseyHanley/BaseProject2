package com.genspark.core;

import com.genspark.entity.Course;
import com.genspark.factory.CourseJPA;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {



    @GetMapping("/")
    public String showHome(){

        return "Home Page: Casey Hanley";
    }
}
