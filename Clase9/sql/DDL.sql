-- USAR UNA BASE DE DATOS
USE javasabado;


CREATE TABLE IF NOT EXISTS alumnos (
  TipoDocumento char(3) NOT NULL,
  NumeroDocumento int(11) NOT NULL,
  Nombre varchar(100) DEFAULT NULL,
  Apellido varchar(100) DEFAULT NULL,
  FechaNacimiento date DEFAULT NULL,
  PRIMARY KEY (NumeroDocumento,TipoDocumento)
);


CREATE TABLE IF NOT EXISTS cursos (
  ID int(11) NOT NULL AUTO_INCREMENT,
  Descripcion varchar(100) NOT NULL,
  PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS cursos_alumnos (
  TipoDocumento char(3) NOT NULL,
  NumeroDocumento int(11) NOT NULL,
  ID_Curso int(11) DEFAULT NULL,
  FOREIGN KEY (NumeroDocumento, TipoDocumento) REFERENCES alumnos (NumeroDocumento, TipoDocumento),
  FOREIGN KEY (ID_Curso) REFERENCES cursos (ID)
);


CREATE TABLE IF NOT EXISTS tipoempleado (
  ID int(11) NOT NULL AUTO_INCREMENT,
  Descripcion varchar(100) NOT NULL,
  PRIMARY KEY (ID)
);


CREATE TABLE IF NOT EXISTS empleados (
  TipoDocumento char(3) NOT NULL,
  NumeroDocumento int(11) NOT NULL,
  Nombre varchar(100) DEFAULT NULL,
  Apellido varchar(100) DEFAULT NULL,
  FechaNacimiento date DEFAULT NULL,
  FechaCargo date DEFAULT NULL,
  sueldo double DEFAULT NULL,
  Tipo int(11) DEFAULT NULL,
  PRIMARY KEY (NumeroDocumento,TipoDocumento)
);

CREATE TABLE IF NOT EXISTS cursos_profesores (
  TipoDocumento char(3) NOT NULL,
  NumeroDocumento int(11) NOT NULL,
  ID_Curso int(11) DEFAULT NULL,
  FOREIGN KEY (NumeroDocumento, TipoDocumento) REFERENCES empleados (NumeroDocumento, TipoDocumento),
  FOREIGN KEY (ID_Curso) REFERENCES cursos (ID)
);