CREATE TABLE IF NOT EXISTS lectors (
    id BIGSERIAL PRIMARY KEY,
    email TEXT NOT NULL,
    first_name Text,
    last_name Text,
    salary DOUBLE PRECISION,
    degree TEXT
);