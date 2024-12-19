
TRUNCATE TABLE lectors RESTART IDENTITY CASCADE;
TRUNCATE TABLE departments RESTART IDENTITY CASCADE;

INSERT INTO lectors (id, email, first_name, last_name, salary, degree) VALUES
(1, 'albus.dumbledore@hogwarts.edu', 'Albus', 'Dumbledore', 10000, 'PROFESSOR'),
(2, 'minerva.mcgonagall@hogwarts.edu', 'Minerva', 'McGonagall', 9000, 'ASSISTANT'),
(3, 'severus.snape@hogwarts.edu', 'Severus', 'Snape', 8500, 'PROFESSOR');


INSERT INTO departments (id, name, head) VALUES
(1, 'Gryffindor', 2),
(2, 'Slytherin', 3),
(3, 'Ravenclaw', 1);

UPDATE lectors SET department_id = 1 WHERE id = 2;
UPDATE lectors SET department_id = 2 WHERE id = 3;
UPDATE lectors SET department_id = 3 WHERE id = 1;



