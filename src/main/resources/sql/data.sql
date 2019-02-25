-- USER
-- non-encrypted password: jwtpass
INSERT INTO users (id, first_name, last_name, password, user_name) VALUES (1, 'Mustafa Ogün', 'Öztürk', '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe', 'tatar');
INSERT INTO users (id, first_name, last_name, password, user_name) VALUES (2, 'FOB', 'Solutions', '$2a$10$qtH0F1m488673KwgAfFXEOWxsoZSeHqqlB/8BTt3a6gsI5c2mdlfe', 'fob');

-- Populate random city table
INSERT INTO random_city(id, name) VALUES (1, 'Bamako');
INSERT INTO random_city(id, name) VALUES (2, 'Nonkon');
INSERT INTO random_city(id, name) VALUES (3, 'Houston');
INSERT INTO random_city(id, name) VALUES (4, 'Toronto');
INSERT INTO random_city(id, name) VALUES (5, 'New York City');
INSERT INTO random_city(id, name) VALUES (6, 'Mopti');
INSERT INTO random_city(id, name) VALUES (7, 'Koulikoro');
INSERT INTO random_city(id, name) VALUES (8, 'Moscow');