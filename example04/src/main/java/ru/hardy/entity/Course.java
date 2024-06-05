package ru.hardy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long id;         // Идентификатор
    @Column(name = "course_code")
    private String code;     // Идентификационный код курса
    @Column(name = "course_name")
    private String name;     //Название курса

    @OneToMany(mappedBy = "course")
    Set<CourseRating> ratings;
}
