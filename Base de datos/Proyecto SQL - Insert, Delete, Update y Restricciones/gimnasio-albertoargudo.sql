create type lista_disciplina as enum ('yoga', 'pilates', 'crossfit', 'funcional');

create table ENTRENADORES (
    id_matricula int generated always as identity primary key,
    nombre VARCHAR(100) not null,
    disciplina lista_disciplina not null,
    num_licencia CHAR(8) not null unique,
    tarifa DECIMAL(5,2) not null default 30 check (tarifa > 0 and tarifa < 200),
    activo BOOLEAN not null default true
);

insert into ENTRENADORES (nombre, disciplina, num_licencia, tarifa, activo) values
('Miguel Lobato Muñoz', 'yoga', '84234345', 30, true),
('Carlos Montes Perez', 'pilates', '92345824', 40, true),
('Juan Moreno Dominguez', 'yoga', '23834923', 30, false),
('Pedro Lomas Williams', 'crossfit', '15749234', 70, true),
('Martin de Luque Doblas', 'funcional', '63240234', 91, true);

create table SOCIOS (
    id_socio int generated always as identity primary key,
    dni CHAR(9) not null unique,
    nombre VARCHAR(100) not null,
    fecha_nacimiento DATE not null check (fecha_nacimiento > '1920-01-01' and fecha_nacimiento < current_date),
    email VARCHAR(100) unique
);

insert into SOCIOS (dni, nombre, fecha_nacimiento, email) values
('41324352L', 'Juanpe Tapias Calle', '1920-01-02', 'juanpe@gmail.com'),
('93451239C', 'Aitor Martinez Mbappe', '1980-07-25', 'aitor@gmail.com'),
('43629056P', 'Aitana Argudo Peñas', '2002-03-24', 'aitana@gmail.com'),
('74285349N', 'Fausto Pinto Granos', '2004-04-15', 'fausto@gmail.com'),
('03452864K', 'Pablo Motos Lobato', '2000-11-18', 'pablo@gmail.com');

create type estado_opciones as enum ('reservada', 'realizada', 'cancelada');

create table SESIONES (
    id_sesion int generated always as identity primary key,
    id_socio int not null references SOCIOS(id_socio),
    id_entrenador int not null references ENTRENADORES(id_matricula),
    fecha_hora TIMESTAMP not null,
    estado estado_opciones not null,
    precio DECIMAL(5,2) not null check (precio > 0 and precio < 200),
    descuento int not null default 0 check (descuento <= 20 and descuento >= 0),
    total DECIMAL(5,2) GENERATED ALWAYS AS (precio - (descuento / 100.0 * precio)) STORED,
);

insert into SESIONES (id_socio, id_entrenador, fecha_hora, estado, precio, descuento) values
(1, 1,'2016-07-24 19:58:17', 'reservada', 180.99, 15),
(2, 3,'2020-09-19 15:34:56', 'realizada', 110.99, 14),
(3, 2,'1999-06-24 08:36:47', 'cancelada', 140.99, 20),
(2, 1,'2019-04-24 14:46:24', 'realizada', 87.99, 19),
(3, 5,'2005-07-24 12:30:19', 'realizada', 14.99, 12),
(1, 4,'2008-02-24 02:49:22', 'cancelada', 166.00, 0),
(5, 2,'2023-09-24 05:54:36', 'reservada', 43.99, 3),
(5, 3,'2010-06-24 11:20:59', 'reservada', 28.99, 9),
(4, 1,'2015-04-24 20:39:05', 'cancelada', 99.99, 6),
(1, 3,'2018-12-24 21:17:08', 'cancelada', 56.99, 5),
(4, 2,'2019-11-24 16:34:56', 'realizada', 12.99, 10);

SELECT * FROM entrenadores;
SELECT * FROM socios;
SELECT * FROM sesiones;

delete from entrenadores where id_matricula = 2;
delete from entrenadores where activo = false;
delete from entrenadores where disciplina = 'yoga';
delete from entrenadores where nombre = 'Quique Matamoros Sanchez';
delete from entrenadores where tarifa = 30;

delete from socios where id_socio = 5;
delete from socios where dni = '34358239W';
delete from socios where nombre = 'Lopez Motos Fuentes';
delete from socios where fecha_nacimiento = '2001-01-01';
delete from socios where email = 'miguel@gmail.com';

delete from sesiones where id_sesion = 4;
delete from sesiones where id_socio = 1;
delete from sesiones where id_entrenador = 2;
delete from sesiones where estado = 'reservada';
delete from sesiones where descuento = 4;

update entrenadores
set activo = true
where tarifa >= 100;
update entrenadores
set activo = false
where tarifa < 100;
update entrenadores
set disciplina = 'pilates'
where activo = true;
update entrenadores
set disciplina = 'yoga'
where activo = false;
update entrenadores
set activo = true
where disciplina = 'funcional';

update socios
set nombre = 'Aitana Argudo Peñas'
where fecha_nacimiento >= '1980-01-01';
update socios
set nombre = 'Aitor Martinez Mbappe'
where email = 'aitor@gmail.com';
update socios
set dni = '12345678Z'
where email = 'aitor@gmail.com';
update socios
set nombre = 'Pablo Motos Lobato'
where fecha_nacimiento = '2004-04-15';
update socios
set email = 'pablo.motos@gmail.com'
where dni = '03452864K';

update sesiones
set id_socio = 3
where id_entrenador = 1;
update sesiones
set id_entrenador = 4
where id_socio = 4;
update sesiones
set estado = 'reservada'
where precio >= 170.99;
update sesiones
set descuento = 12
where estado = 'realizada';
update sesiones
set precio = 99.99
where id_socio = 4;