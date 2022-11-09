CREATE TABLE IF NOT EXISTS asistente(
    id SERIAL,
    nombres VARCHAR(25) NOT NULL,
    email VARCHAR(15),
    institucion VARCHAR(30),
    cargo VARCHAR(20),
    PRIMARY KEY (id),
    UNIQUE (email)
    );