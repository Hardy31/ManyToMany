insert into course (course_code, course_name)
values ('101', 'IT'),
       ('102', 'DV'),
       ('103', 'HR'),
       ('104', 'AI');

insert into student(student_name, student_recordbook)
VALUES ('Студент1', 'зачетка1'),
       ('Студент2', 'зачетка2'),
       ('Студент3', 'зачетка3'),
       ('Студент4', 'зачетка4'),
       ('Студент5', 'зачетка5'),
       ('Студент6', 'зачетка6'),
       ('Студент7', 'зачетка7'),
       ('Студент8', 'зачетка8'),
       ('Студент9', 'зачетка9'),
       ('Студент10', 'зачетка10');



-- INSERT INTO course_registration(student_id, course_id, grade)
-- VALUES (1, 1, 5),
--        (1, 4, 4),
--        (2, 2, 5),
--        (3, 3, 4),
--        (4, 2, 5),
--        (5, 3, 4),
--        (6, 1, 4),
--        (6, 2, 3),
--        (7, 1, 3),
--        (8, 4, 4),
--        (9, 1, 4);



INSERT INTO course_registration(student_id, course_id, grade, registeredAt)
VALUES (1, 1, 5, '2024-05-01 01:13:42.000000'),
       (1, 4, 4, '2024-05-02 01:13:42.000000'),
       (2, 2, 5, '2024-05-02 01:13:42.000000'),
       (3, 3, 4, '2024-05-03 01:13:42.000000'),
       (4, 2, 5, '2024-05-09 01:13:42.000000'),
       (5, 3, 4, '2024-05-11 01:13:42.000000'),
       (6, 1, 4, '2024-05-12 01:13:42.000000'),
       (6, 2, 3, '2024-05-12 01:13:42.000000'),
       (7, 1, 3, '2024-05-18 01:13:42.000000'),
       (8, 4, 4, '2024-05-21 01:13:42.000000'),
       (9, 1, 4, '2024-06-01 01:13:42.000000');
