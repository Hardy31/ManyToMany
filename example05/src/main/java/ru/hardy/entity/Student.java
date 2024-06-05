package ru.hardy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private  Long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "student_recordbook", unique = true)
    private String recordBook;

//    @OneToMany(mappedBy = "student")
//    Set<CourseRating> ratings;

    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> registrations;
}
