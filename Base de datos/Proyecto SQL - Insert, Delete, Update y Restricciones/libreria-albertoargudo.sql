create type estado_pedido as enum ('pendiente', 'preparado', 'entregado');

create table GENERO (
    id_genero int generated always as identity primary key,
    nombre VARCHAR(100) not null unique
);

insert into GENERO (nombre) values
('Novela negra'),
('Ciencia ficción'),
('Ensayo'),
('Poesía'),
('Fantasía');

create table EDITORIAL (
    id_editorial int generated always as identity primary key,
    nombre_comercial VARCHAR(100) not null unique,
    telefono CHAR(9) not null,
    nombre_contacto VARCHAR(100) not null,
    direccion VARCHAR(200) not null
);

insert into EDITORIAL (nombre_comercial, telefono, nombre_contacto, direccion) values
('Anagrama', '932460176', 'Marta Soler Vidal', 'Calle Provenza 25, 08019 Barcelona'),
('Alianza Editorial', '913938100', 'Javier Ortega Cano', 'Calle Valentín Beato 21, 28037 Madrid'),
('Debate', '911069200', 'Lucía Ferrer Sanz', 'Paseo de Recoletos 4, 28001 Madrid'),
('Visor', '914454354', 'Andrea López Gil', 'Calle Manuel Silvela 14, 28004 Madrid'),
('Minotauro', '912098700', 'Carlos Peña Marín', 'Avenida de los Pinos 8, 28030 Madrid');

create table CLIENTE (
    id_cliente int generated always as identity primary key,
    nombre VARCHAR(100) not null,
    telefono CHAR(9) not null,
    unique (nombre, telefono)
);

insert into CLIENTE (nombre, telefono) values
('Carmen Ruiz Hidalgo', '651223344'),
('Juan Torres Medina', '652334455'),
('Lucía Navas Peral', '653445566'),
('Andrés Molina Serrano', '654556677'),
('Pilar Cuesta Arias', '655667788');

create table LIBRO (
    isbn CHAR(13) primary key,
    titulo VARCHAR(200) not null,
    autor VARCHAR(100) not null,
    precio_editorial DECIMAL(6,2) not null check (precio_editorial > 0),
    precio_publico DECIMAL(6,2) not null check (precio_publico > precio_editorial),
    stock int not null default 0 check (stock >= 0),
    id_genero int not null references GENERO(id_genero) on delete cascade,
    id_editorial int not null references EDITORIAL(id_editorial) on delete cascade
);

insert into LIBRO (isbn, titulo, autor, precio_editorial, precio_publico, stock, id_genero, id_editorial) values
('9788408163911', 'La sombra del viento', 'Carlos Ruiz Zafón', 10.50, 18.90, 12, 1, 1),
('9788498905287', 'Fahrenheit 451', 'Ray Bradbury', 6.80, 12.95, 15, 2, 2),
('9788423357031', 'Breve historia del tiempo', 'Stephen Hawking', 11.00, 19.95, 6, 3, 3),
('9788491042111', 'Veinte poemas de amor y una canción desesperada', 'Pablo Neruda', 5.20, 9.50, 10, 4, 4),
('9788401352836', 'El nombre del viento', 'Patrick Rothfuss', 14.00, 24.90, 9, 5, 5),
('9788432248939', 'Neuromante', 'William Gibson', 7.30, 13.00, 0, 2, 2);

create table VENTA (
    id_venta int generated always as identity primary key,
    fecha DATE not null,
    total DECIMAL(8,2) not null check (total > 0),
    id_cliente int not null references CLIENTE(id_cliente) on delete cascade
);

insert into VENTA (fecha, total, id_cliente) values
('2025-01-10', 49.80, 1),
('2025-01-18', 19.95, 2),
('2025-02-02', 25.90, 3),
('2025-02-14', 37.90, 1),
('2025-03-01', 24.90, 4);

create table PEDIDO (
    id_pedido int generated always as identity primary key,
    fecha_formalizacion DATE not null,
    fecha_entrega DATE check (fecha_entrega is null or fecha_entrega >= fecha_formalizacion),
    estado estado_pedido not null,
    id_cliente int not null references CLIENTE(id_cliente) on delete cascade
);

insert into PEDIDO (fecha_formalizacion, fecha_entrega, estado, id_cliente) values
('2025-01-05', '2025-01-20', 'entregado', 2),
('2025-01-25', '2025-02-10', 'entregado', 3),
('2025-02-03', '2025-02-18', 'preparado', 4),
('2025-02-15', '2025-03-01', 'pendiente', 5),
('2025-02-28', '2025-03-15', 'pendiente', 1),
('2025-03-04', '2025-03-20', 'pendiente', 2);

create table SOLICITUD_VENTA (
    id_solicitud int generated always as identity primary key,
    isbn CHAR(13) not null references LIBRO(isbn) on delete cascade,
    id_venta int not null references VENTA(id_venta) on delete cascade,
    num_ejemplares int not null check (num_ejemplares > 0),
    unique (isbn, id_venta)
);

insert into SOLICITUD_VENTA (isbn, id_venta, num_ejemplares) values
('9788401352836', 1, 2),
('9788423357031', 2, 1),
('9788498905287', 3, 2),
('9788408163911', 4, 1),
('9788491042111', 4, 2),
('9788401352836', 5, 1);

create table SOLICITUD_PEDIDO (
    id_solicitud int generated always as identity primary key,
    isbn CHAR(13) not null references LIBRO(isbn) on delete cascade,
    id_pedido int not null references PEDIDO(id_pedido) on delete cascade,
    num_ejemplares int not null check (num_ejemplares > 0),
    unique (isbn, id_pedido)
);

insert into SOLICITUD_PEDIDO (isbn, id_pedido, num_ejemplares) values
('9788432248939', 1, 1),
('9788401352836', 2, 1),
('9788408163911', 3, 3),
('9788498905287', 4, 2),
('9788432248939', 5, 2),
('9788423357031', 6, 1);

SELECT * FROM genero;
SELECT * FROM editorial;
SELECT * FROM cliente;
SELECT * FROM libro;
SELECT * FROM venta;
SELECT * FROM pedido;
SELECT * FROM solicitud_venta;
SELECT * FROM solicitud_pedido;