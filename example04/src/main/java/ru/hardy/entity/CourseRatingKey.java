package ru.hardy.entity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*
Чтобы определить составные первичные ключи, мы должны следовать некоторым правилам:

    -   Класс составного первичного ключа должен быть общедоступным.
    -   Он должен иметь конструктор без аргументов.
    -   Он должен определить методы Equals() и hashCode() .
    -   Он должен быть сериализуемым .
 */

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public  class CourseRatingKey implements Serializable {

    @Column(name = "student_id")
    Long student;

    @Column(name = "course_id")
    Long course;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}