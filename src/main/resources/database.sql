CREATE DATABASE projectk2;

create table role(
    id int auto_increment not null ,
    name varchar(20) not null ,
    flag varchar(10) not null ,
    create_at datetime ,
    update_at datetime
);
