--liquibase formatted sql
--changeset konnov:events-1
CREATE TABLE IF NOT EXISTS events
(
    id          bigserial,
    name        varchar,
    description varchar(1024),
    date_start  timestamp with time zone,
    date_end    timestamp with time zone,
    primary key (id)
);

COMMENT ON TABLE events IS 'Событие';
COMMENT ON COLUMN events.id IS 'Идентификатор';
COMMENT ON COLUMN events.name IS 'Название события';
COMMENT ON COLUMN events.description IS 'Описание события';
COMMENT ON COLUMN events.date_start IS 'Дата начала события';
COMMENT ON COLUMN events.date_start IS 'Дата конца события';

--rollback DROP TABLE events;
