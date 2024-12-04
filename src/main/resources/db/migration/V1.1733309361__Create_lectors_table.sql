CREATE TABLE IF NOT EXISTS user_table (
    id BIGSERIAL PRIMARY KEY,
    email TEXT NOT NULL,
    first_name Text,
    last_name TextL,
    salary DOUBLE PRECISION,
    department_id BIGSERIAL,
    FOREIGN KEY (department_id) REFERENCES departments(id)
);