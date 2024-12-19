ALTER TABLE lectors
ADD COLUMN IF NOT EXISTS department_id BIGINT,
ADD CONSTRAINT fk_department_id
FOREIGN KEY (department_id)
REFERENCES departments(id);