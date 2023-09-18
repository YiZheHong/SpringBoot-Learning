package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Potter",
                        "yhong@bg.edu",
                        LocalDate.of(2000,1,1),
                        22L
                )


        );
    }
}
