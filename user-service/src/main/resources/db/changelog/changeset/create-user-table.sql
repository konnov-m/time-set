CREATE TABLE users
(id bigserial,
 username varchar(256) not null UNIQUE,
 password varchar(256),
 primary key(id)
);
