create database biblifal;

\connect biblifal;

CREATE TABLE user(
  id SERIAL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(150) NOT NULL,
  is_manager BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE section(
  id SERIAL,
  name VARCHAR(100) NOT NULL PRIMARY KEY,
  description TEXT
);

CREATE TABLE shelf(
  id SERIAL PRIMARY KEY,
  section_id INT NOT NULL,
  capacity INT NOT NULL,

  CONSTRAINT section_fk FOREIGN KEY (section_id) REFERENCES section (id)
);

CREATE TABLE book(
  id SERIAL,
  title VARCHAR(100) NOT NULL,
  publishing_company VARCHAR(50),
  author VARCHAR NOT NULL,
  price NUMERIC(6,2) NOT NULL,
  shelf_id INT NOT NULL,

  CONSTRAINT shelf_fk FOREIGN KEY (shelf_id) REFERENCES shelf (id)
);