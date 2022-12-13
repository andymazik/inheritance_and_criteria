set search_path = "company";

drop table clients;
drop table employees;
drop table users;

create table clients
(
    client_id        int,
--     name      varchar,
--     birthdate timestamp,
    address   varchar
);

create table employees
(
    employee_id         int,
--     name       varchar,
--     birthday   timestamp,
    occupation varchar,
    salary     int,
    join_date  timestamp
);

create table users
(
    user_id       int,
    name     varchar,
    birthday timestamp
);

truncate table users;
truncate table clients;
truncate table employees;
