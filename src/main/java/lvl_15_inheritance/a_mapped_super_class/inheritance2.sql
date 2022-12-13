set search_path = "company";
--
-- drop table users;
-- drop table managers;
-- drop table supervisors;
-- drop table clients;
-- drop table individuals;
-- drop table legal_entities;

truncate table users;
truncate table clients;
truncate table individuals;
truncate table legal_entities;
truncate table managers;
truncate table supervisors;

create table users
(
    id   int,
    name varchar
);

create table managers
(
    id        int,
    name      varchar,
    title     varchar,
    salary    int,
    hire_date date
);


create table supervisors
(
    id           int,
    name         varchar,
    title        varchar,
    salary       int,
    hire_date    date,
    subordinates int
);


create table clients
(
    id          int,
    name        varchar,
    address     varchar,
    client_from date
);

create table individuals
(
    id          int,
    name        varchar,
    address     varchar,
    client_from date,
    tax_number  int,
    birthday    date
);

create table legal_entities
(
    id                  int,
    name                varchar,
    address             varchar,
    client_from         date,
    registration_number varchar

);






