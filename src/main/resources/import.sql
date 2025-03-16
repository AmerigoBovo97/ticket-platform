INSERT INTO roles (name) VALUES ("ADMIN");
INSERT INTO roles (name) VALUES ("USER");

INSERT INTO users (username, password) VALUES ('amerigo', 123), ('riccardo', 123), ('davide', 123), ('lucrezia', 123), ('paolo', 123), ('danilo', 123);

INSERT INTO role_user (role_id, user_id) VALUES (1, 1), (2, 2), (2, 3), (2, 4), (2, 5), (2, 6);

INSERT INTO sates (name) VALUES ('to do'), ('in progress'), ('completed');

INSERT INTO categories (name) VALUES ('CRUD'), ('security'), ('repository'), ('controller'), ('service'), ('REST API'), ('thymeleaf');

INSERT into tickets (title, text, creation_date, user_id, state_id, category_id) VALUES ('prblema con la create', 'come mai quando richiamo il template della create mi da un errore?', '2025-03-16', 1, 1, 1), ('prblema con thymeleaf', 'come si faceva a passare un oggetto?', '2025-03-16', 1, 1, 7), ('errore sconosciuto', 'non capisco cosa significa SuperMegaErroreLogin', '2025-03-14', 1, 1, 2), ('metodi della repository', 'come aggiungo un metodo nella repository?', '2025-03-16', 1, 1, 3)