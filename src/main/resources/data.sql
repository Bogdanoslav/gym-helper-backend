INSERT INTO person (first_name, last_name, email, birthday, phone, start_day, about) VALUES
('Dave', 'Davinsky', 'dave@mail.com', '1994-10-27', '+380936360212', '1994-10-27', 'About'),
('Timur', 'Trenbalonsky', 'tren@mail.com', '1994-10-27', '+380936360212', '1994-10-27', 'About'),
('Pawel', 'Preparatov', 'tren@mail.com', '1994-10-27', '+380936360212', '1994-10-27', 'About'),
('Clint', 'Eastwood', 'tren@mail.com', '1994-10-27', '+380936360212', '1994-10-27', 'About'),
('Helen', 'Reebokuva', 'tren@mail.com', '1994-10-27', '+380936360212', '1994-10-27', 'About');

INSERT into user_credentials (id, username, password) VALUES
(1, 'Dave', '$2a$10$i0m24FWJFDmqktpy.YbezeVvcKwm2u/JmwnA6FkZXqPzzAnAFonJy'),
(2, 'Timur', '$2a$10$i0m24FWJFDmqktpy.YbezeVvcKwm2u/JmwnA6FkZXqPzzAnAFonJy'),
(3, 'Pawel', '$2a$10$i0m24FWJFDmqktpy.YbezeVvcKwm2u/JmwnA6FkZXqPzzAnAFonJy'),
(4, 'Clint', '$2a$10$i0m24FWJFDmqktpy.YbezeVvcKwm2u/JmwnA6FkZXqPzzAnAFonJy'),
(5, 'Helen', '$2a$10$i0m24FWJFDmqktpy.YbezeVvcKwm2u/JmwnA6FkZXqPzzAnAFonJy');

INSERT INTO manager (id, experience) VALUES
(1, 5);

INSERT INTO trainer (id, qualifications, experience) VALUES
(2,'CPR, AED', 5);

INSERT INTO paramedic (id, qualifications, experience) VALUES
(3,'CPR, AED', 5);

INSERT INTO client (id, health_problems, trainer_id) VALUES
(4,'Heart disease, leg injury', 2);

INSERT INTO hr_specialist (id, experience) VALUES
(5,4);

INSERT INTO user_role (user_id, role) VALUES
(1,'USER'),
(1,'MANAGER'),

(2,'USER'),
(2,'TRAINER'),

(3,'USER'),
(3,'PARAMEDIC'),

(4,'USER'),
(4,'CLIENT'),

(5,'USER'),
(5,'HR');