set search_path = "company";

drop table users;
drop table managers;
drop table clients;

create table users
(
    id       serial,
    name     varchar,
    birthday timestamp
);

create table managers
(
    id         serial,
    name       varchar,
    birthday   timestamp,
    occupation varchar,
    salary     int,
    join_date  timestamp
);

create table clients
(
    id        serial,
    name      varchar,
    birthday timestamp,
    address   varchar
);

truncate table users;
truncate table managers;
truncate table clients;
