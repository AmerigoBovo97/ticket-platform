INSERT INTO roles (name) VALUES ("ADMIN");
INSERT INTO roles (name) VALUES ("OPERATOR");

INSERT INTO users (username, password, state) VALUES ('amerigo', '{noop}123', true), ('riccardo', '{noop}123', false), ('davide', '{noop}123', true), ('lucrezia', '{noop}123', false), ('paolo', '{noop}123', false), ('danilo', '{noop}123', true);

INSERT INTO role_user (role_id, user_id) VALUES (1, 1), (2, 1), (2, 2), (2, 3), (2, 4), (2, 5), (2, 6);

INSERT INTO sates (name) VALUES ('to do'), ('in progress'), ('completed');

UPDATE users SET state = true WHERE id = 5;

INSERT INTO categories (name) VALUES ('CRUD'), ('security'), ('repository'), ('controller'), ('service'), ('REST API'), ('thymeleaf');

INSERT into tickets (title, text, creation_date, user_id, state_id, category_id) VALUES ('prblema con la create', 'come mai quando richiamo il template della create mi da un errore?', '2025-03-16', 2, 1, 1), ('prblema con thymeleaf', 'come si faceva a passare un oggetto?', '2025-03-11', 3, 1, 7), ('errore sconosciuto', 'non capisco cosa significa SuperMegaErroreLogin', '2025-03-14', 4, 1, 2), ('metodi della repository', 'come aggiungo un metodo nella repository?', '2025-03-12', 5, 1, 3)