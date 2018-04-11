-- criar banco de dados 

create database projeto1;

use projeto1;

create table cliente(

	id int primary key auto_increment,
	nome varchar(30),
	email varchar(30),
	sexo varchar(30),
	estcivil varchar(10)
);

insert into cliente values
(null,'Ana','ana@gmail.com','feminino','solteiro');