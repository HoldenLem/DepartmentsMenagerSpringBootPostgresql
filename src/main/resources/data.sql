TRUNCATE TABLE lectors RESTART IDENTITY CASCADE;

INSERT INTO lectors (id, email, first_name, last_name, salary, degree) VALUES
(1, 'albus.dumbledore@hogwarts.edu', 'Albus', 'Dumbledore', 10000, 'PROFESSOR'),
(2, 'minerva.mcgonagall@hogwarts.edu', 'Minerva', 'McGonagall', 9000, 'ASSISTANT'),
(3, 'severus.snape@hogwarts.edu', 'Severus', 'Snape', 8500, 'PROFESSOR');

TRUNCATE TABLE departments;

INSERT INTO departments (id, name, head) VALUES
(1, 'Gryffindor', 2),
(2, 'Slytherin', 3),
(3, 'Ravenclaw', 1);



