INSERT INTO lectors (id, email, first_name, last_name) VALUES
(1, 'john.doe@example.com', 'John', 'Doe'),
(2, 'jane.smith@example.com', 'Jane', 'Smith'),
(3, 'emily.johnson@example.com', 'Emily', 'Johnson')
ON CONFLICT (id) DO NOTHING;