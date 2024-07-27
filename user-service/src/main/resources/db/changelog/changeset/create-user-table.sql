--liquibase formatted sql
--changeset konnov:users-1
CREATE TABLE IF NOT EXISTS users
(
    id bigserial,
    username varchar(256) not null UNIQUE,
    password varchar(256),
    primary key(id)
);

COMMENT ON TABLE  users          IS 'Пользователи';
COMMENT ON COLUMN users.id       IS 'Идентификатор';
COMMENT ON COLUMN users.username IS 'Имя пользователя';
COMMENT ON COLUMN users.password IS 'Пароль пользователя';

--rollback DROP TABLE users;
--changeset konnov:users-2
INSERT INTO users (username, password) VALUES ('konnov', 'password');

--rollback DELETE FROM users;