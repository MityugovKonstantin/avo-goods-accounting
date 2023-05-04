CREATE TABLE locations (
    Id SERIAL PRIMARY KEY NOT NULL,
    cabinet varchar NOT NULL,
    building varchar NOT NULL
);

CREATE TABLE person (
    Id SERIAL PRIMARY KEY NOT NULL ,
    first_name VARCHAR NOT NULL ,
    second_name VARCHAR NOT NULL ,
    patronymic VARCHAR,
    job_title VARCHAR NOT NULL
)