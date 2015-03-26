DELETE FROM APP_USER;

INSERT INTO APP_USER (id, email, firstname, lastname) VALUES (1, 'myUser@gmail.com', 'Per', 'Nordmann');
INSERT INTO APP_USER (id, email, firstname, lastname) VALUES (2, 'myUser@hotmail.com', 'Pål', 'Nordmann');
INSERT INTO APP_USER (id, email, firstname, lastname) VALUES (3, 'myUser@outlook.com', 'Askeladden', 'Nordmann');

INSERT INTO APP_USER_INTERESTS (app_user_id, interests) values (1, 1);
INSERT INTO APP_USER_INTERESTS (app_user_id, interests) values (1, 2);
INSERT INTO APP_USER_INTERESTS (app_user_id, interests) values (2, 2);
INSERT INTO APP_USER_INTERESTS (app_user_id, interests) values (2, 3);
INSERT INTO APP_USER_INTERESTS (app_user_id, interests) values (2, 4);