package ru.hardy.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@IdClass(CourseRatingKey.class)
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_rating")
class CourseRating {

//    @EmbeddedId
//    CourseRatingKey id;
    @Id
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @Id
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    Course course;

    int rating;

    // standard constructors, getters, and setters
}
