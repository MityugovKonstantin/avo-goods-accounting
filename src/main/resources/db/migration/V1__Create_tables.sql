CREATE TABLE location (
    id SERIAL PRIMARY KEY NOT NULL,
    cabinet varchar NOT NULL,
    building varchar NOT NULL
);

CREATE TABLE person (
    id SERIAL PRIMARY KEY NOT NULL ,
    first_name VARCHAR NOT NULL ,
    second_name VARCHAR NOT NULL ,
    patronymic VARCHAR,
    job_title VARCHAR NOT NULL
);

CREATE TABLE technical_condition (
    condition VARCHAR PRIMARY KEY NOT NULL
);

CREATE TABLE operation_status (
    status VARCHAR PRIMARY KEY NOT NULL
);

CREATE TABLE ups (
    id SERIAL PRIMARY KEY NOT NULL ,
    name VARCHAR NOT NULL ,
    person_id int REFERENCES person (id),
    location_id int REFERENCES location (id),
    commissioning_date DATE,
    operation_status VARCHAR REFERENCES operation_status (status),
    technical_condition VARCHAR REFERENCES technical_condition (condition),
    amortization_period INT ,
    registration_date DATE NOT NULL ,
    writeoff_date DATE ,
    power INT NOT NULL ,
    max_run_time INT NOT NULL
)