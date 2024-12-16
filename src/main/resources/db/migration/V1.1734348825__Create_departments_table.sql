CREATE TABLE IF NOT EXISTS departments (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    head BIGSERIAL,
    CONSTRAINT fk_head FOREIGN KEY (head) REFERENCES lectors(id)
);