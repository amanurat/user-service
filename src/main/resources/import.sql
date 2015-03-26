DELETE FROM USER;

INSERT INTO USER (id, email, firstname, lastname) VALUES (1, 'myUser@gmail.com', 'Per', 'Nordmann');
INSERT INTO USER (id, email, firstname, lastname) VALUES (2, 'myUser@hotmail.com', 'Pål', 'Nordmann');
INSERT INTO USER (id, email, firstname, lastname) VALUES (3, 'myUser@outlook.com', 'Askeladden', 'Nordmann');

INSERT INTO USER_INTERESTS (user_id, interests) values (1, 1);
INSERT INTO USER_INTERESTS (user_id, interests) values (1, 2);
INSERT INTO USER_INTERESTS (user_id, interests) values (2, 2);
INSERT INTO USER_INTERESTS (user_id, interests) values (2, 3);
INSERT INTO USER_INTERESTS (user_id, interests) values (2, 4);