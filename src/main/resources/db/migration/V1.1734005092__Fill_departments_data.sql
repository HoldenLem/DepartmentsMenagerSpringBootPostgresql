INSERT INTO departments (id, name, head) VALUES
(1, 'Computer Science', 1),
(2, 'Mathematics', 2),
(3, 'Physics', 3)
ON CONFLICT (id) DO NOTHING;