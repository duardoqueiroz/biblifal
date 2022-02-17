create database biblifal;

\connect biblifal;

CREATE TABLE users(
  id SERIAL,
  name VARCHAR(50) NOT NULL,
  email VARCHAR(150) NOT NULL PRIMARY KEY,
  password VARCHAR(500) NOT NULL,
  is_manager BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE sections(
  id SERIAL PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  description TEXT
);

CREATE TABLE shelfs(
  id SERIAL PRIMARY KEY,
  section_id INT NOT NULL,
  capacity INT NOT NULL,

  CONSTRAINT section_fk FOREIGN KEY (section_id) REFERENCES sections (id)
);

CREATE TABLE books(
  id SERIAL PRIMARY KEY,
  title VARCHAR(100) NOT NULL,
  publishing_company VARCHAR(50),
  author VARCHAR NOT NULL,
  price NUMERIC(6,2) NOT NULL
);

CREATE TABLE genres(
  id SERIAL PRIMARY KEY,
  name VARCHAR(50)
);

CREATE TABLE book_genres(
  id SERIAL PRIMARY KEY,
  book_id INT,
  genre_id INT,

  CONSTRAINT book_fk FOREIGN KEY (book_id) REFERENCES books (id),
  CONSTRAINT genre_fk FOREIGN KEY (genre_id) REFERENCES genres (id)
);

CREATE TABLE shelf_books(
  id SERIAL PRIMARY KEY,
  shelf_id INT,
  book_id INT,
  quantity INT,

  CONSTRAINT shelf_fk FOREIGN KEY (shelf_id) REFERENCES shelfs (id),
  CONSTRAINT book_fk FOREIGN KEY (book_id) REFERENCES books (id)
);