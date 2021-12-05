package com.example.springbootcloud.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Component
@Entity(name = "course")
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private Long course_id;

    @Column(name = "name")
    private String name;

    @Column(name = "teacher_id")
    private String teacher_id;
}
