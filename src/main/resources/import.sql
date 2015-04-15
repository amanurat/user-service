DELETE FROM app_user;

INSERT INTO app_user (id, email, firstname, lastname) VALUES (1, 'myUser@gmail.com', 'Per', 'Nordmann');
INSERT INTO app_user (id, email, firstname, lastname) VALUES (2, 'myUser@hotmail.com', 'Pål', 'Nordmann');
INSERT INTO app_user (id, email, firstname, lastname) VALUES (3, 'myUser@outlook.com', 'Askeladden', 'Nordmann');

INSERT INTO app_user_interests (app_user_id, interests) values (1, 1);
INSERT INTO app_user_interests (app_user_id, interests) values (1, 2);
INSERT INTO app_user_interests (app_user_id, interests) values (2, 2);
INSERT INTO app_user_interests (app_user_id, interests) values (2, 3);
INSERT INTO app_user_interests (app_user_id, interests) values (2, 4);