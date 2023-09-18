package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
                Student Potter = new Student(
                        "Potter",
                        "yhong@bg.edu",
                        LocalDate.of(2000,1,1),
                        22L
                );
            Student Harry = new Student(
                    "Harry",
                    "hhong@bg.edu",
                    LocalDate.of(2000,2,1),
                    23L
            );
            studentRepository.saveAll(
                    List.of(Potter,Harry)
            );
        };
    }
}
