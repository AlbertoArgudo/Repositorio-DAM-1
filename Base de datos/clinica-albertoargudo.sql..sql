create type estado_cita as enum ('pendiente', 'atendida', 'cancelada');

create table ESPECIALIDAD (
    id_especialidad int generated always as identity primary key,
    nombre VARCHAR(100) not null,
    planta int not null check (planta > 0 and planta < 20)
);

insert into ESPECIALIDAD (nombre, planta) values
('Cardiología', 1),
('Dermatología', 2),
('Neurología', 3),
('Pediatría', 1),
('Traumatología', 4);

create table MEDICOS (
    numero_colegiado int generated always as identity primary key,
    nombre VARCHAR(100) not null,
    apellidos VARCHAR(100) not null,
    dni CHAR(9) not null unique,
    telefono CHAR(9) not null,
    email VARCHAR(100) unique,
    id_especialidad int not null references ESPECIALIDAD(id_especialidad)
);

insert into MEDICOS (nombre, apellidos, dni, telefono, email, id_especialidad) values
('Juan', 'Pérez García', '12345678A', '600111222', 'juan.perez@saludintegral.es', 1),
('María', 'López Martínez', '23456789B', '600333444', 'maria.lopez@saludintegral.es', 2),
('Carlos', 'Sánchez Ruiz', '34567890C', '600555666', 'carlos.sanchez@saludintegral.es', 3),
('Ana', 'Fernández Torres', '45678901D', '600777888', 'ana.fernandez@saludintegral.es', 4),
('Luis', 'Gómez Díaz', '56789012E', '600999000', 'luis.gomez@saludintegral.es', 5);

create table PACIENTES (
    numero_historia_clinica int generated always as identity primary key,
    dni CHAR(9) not null unique,
    nombre VARCHAR(100) not null,
    apellidos VARCHAR(100) not null,
    fecha_nacimiento DATE not null check (fecha_nacimiento > '1920-01-01' and fecha_nacimiento < current_date),
    telefono CHAR(9) not null,
    email VARCHAR(100) unique
);

insert into PACIENTES (dni, nombre, apellidos, fecha_nacimiento, telefono, email) values
('11111111A', 'Pedro', 'Ramírez Soto', '1980-05-12', '611111111', 'pedro.ramirez@email.com'),
('22222222B', 'Laura', 'Navarro Gil', '1992-08-25', '622222222', 'laura.navarro@email.com'),
('33333333C', 'Miguel', 'Ortega Vega', '1975-01-30', '633333333', 'miguel.ortega@email.com'),
('44444444D', 'Sofía', 'Castro Molina', '2000-11-08', '644444444', 'sofia.castro@email.com'),
('55555555E', 'Diego', 'Herrera León', '1988-03-17', '655555555', 'diego.herrera@email.com');

create table CITAS (
    id_cita int generated always as identity primary key,
    numero_colegiado int not null references MEDICOS(numero_colegiado),
    numero_historia_clinica int not null references PACIENTES(numero_historia_clinica),
    fecha_hora TIMESTAMP not null,
    motivo_consulta VARCHAR(200) not null,
    estado estado_cita not null,
    unique (numero_colegiado, numero_historia_clinica, fecha_hora)
);

insert into CITAS (numero_colegiado, numero_historia_clinica, fecha_hora, motivo_consulta, estado) values
(1, 1, '2025-01-15 09:00:00', 'Revisión cardiológica anual', 'atendida'),
(2, 2, '2025-01-16 10:30:00', 'Consulta por erupción cutánea', 'atendida'),
(3, 3, '2025-01-17 12:00:00', 'Migrañas frecuentes', 'atendida'),
(1, 2, '2025-02-03 09:30:00', 'Palpitaciones y mareo', 'pendiente'),
(3, 5, '2025-02-04 17:30:00', 'Dolor cervical', 'cancelada'),
(5, 4, '2025-02-05 11:00:00', 'Control de fractura', 'pendiente'),
(2, 5, '2025-02-06 12:15:00', 'Revisión de lunar', 'pendiente');

SELECT * FROM especialidad;
SELECT * FROM medicos;
SELECT * FROM pacientes;
SELECT * FROM citas;