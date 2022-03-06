\connect biblifal

TRUNCATE users, sections, shelfs, books, genres, book_genres, shelf_books;

--- users ---
INSERT INTO users (id, name, email, password, is_manager) VALUES (DEFAULT, 'Guilherme de Jesus', 'gui@aluno.ifal.edu.br', '12345678', DEFAULT);

INSERT INTO users (id, name, email, password, is_manager) VALUES (DEFAULT, 'Eduardo Queiroz', 'dudu@aluno.ifal.edu.br', '12345678', DEFAULT);

INSERT INTO users (id, name, email, password, is_manager) VALUES (DEFAULT, 'Jesse Diego', 'jess@aluno.ifal.edu.br', '12345678', DEFAULT);

--- sections ---
INSERT INTO sections (id, name, description) VALUES (1, 'Nacional', 'Seção de livros nacionais.');

INSERT INTO sections (id, name, description) VALUES (2, 'Infantil', 'Seção de livros para crianças.');

INSERT INTO sections (id, name, description) VALUES (3, 'Jovem', 'Seção de livros para jovens.');

--- shelfs ---
INSERT INTO shelfs (id, section_id, capacity) VALUES (1, 1, 10);
INSERT INTO shelfs (id, section_id, capacity) VALUES (2, 2, 10);
INSERT INTO shelfs (id, section_id, capacity) VALUES (3, 3, 10);
INSERT INTO shelfs (id, section_id, capacity) VALUES (4, 3, 10);

--- books ---
INSERT INTO books (id, title, publishing_company, author, price ) VALUES (1, 'Os Sertões', 'Princips', 'Euclides da Cunha', 16.99 );

INSERT INTO books (id, title, publishing_company, author, price ) VALUES (2, 'Diário de Um Banana', 'V&R', 'Jeff Kinney', 24.90 );

INSERT INTO books (id, title, publishing_company, author, price ) VALUES (3, 'Jogos Vorazes', 'Rocco', 'Suzanne Collins', 34.80);

INSERT INTO books (id, title, publishing_company, author, price ) VALUES (4, 'A Seleção', 'Seguinte', 'Kiera Cass', 19.90);

--- genres ---
INSERT INTO genres (id, name) VALUES (1, 'Livro-Reportagem');

INSERT INTO genres (id, name) VALUES (2, 'Romance');

INSERT INTO genres (id, name) VALUES (3, 'Comédia');

INSERT INTO genres (id, name) VALUES (4, 'Ação');

INSERT INTO genres (id, name) VALUES (5, 'Ficção Distópica');

--- book_genres ---

--- --Os Sertões-- ---
INSERT INTO book_genres (id, book_id, genre_id) VALUES (1, 1, 1);

--- --Diário de um Banana-- ---
INSERT INTO book_genres (id, book_id, genre_id) VALUES (2, 2, 2);

INSERT INTO book_genres (id, book_id, genre_id) VALUES (3, 2, 3);

--- --Jogos Vorazes-- ---
INSERT INTO book_genres (id, book_id, genre_id) VALUES (4, 3, 4);

INSERT INTO book_genres (id, book_id, genre_id) VALUES (5, 3, 2);

INSERT INTO book_genres (id, book_id, genre_id) VALUES (6, 3, 5);

--- --A Seleção-- ---
INSERT INTO book_genres (id, book_id, genre_id) VALUES (7, 4, 2);

INSERT INTO book_genres (id, book_id, genre_id) VALUES (8, 4, 5);

--- shelf books ---
INSERT INTO shelf_books (id, shelf_id, book_id, quantity) VALUES (1, 1, 1, 5);

INSERT INTO shelf_books (id, shelf_id, book_id, quantity) VALUES (2, 2, 2, 7);

INSERT INTO shelf_books (id, shelf_id, book_id, quantity) VALUES (3, 3, 3, 5);

INSERT INTO shelf_books (id, shelf_id, book_id, 
quantity) VALUES (4, 3, 4, 5);

INSERT INTO shelf_books (id, shelf_id, book_id, 
quantity) VALUES (5, 3, 2, 5);
