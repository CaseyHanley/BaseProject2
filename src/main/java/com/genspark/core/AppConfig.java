package com.genspark.core;

import com.genspark.services.CourseService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.genspark.entity")
@EnableJpaRepositories(basePackages = "com.genspark.factory")
@ComponentScan(basePackageClasses = CourseService.class)
@EnableAutoConfiguration
public class AppConfig {
}
