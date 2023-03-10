package com.genspark.factory;

import com.genspark.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseJPA extends JpaRepository<Course,Integer> {
}
