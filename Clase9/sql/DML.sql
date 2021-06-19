-- USAR UNA BASE DE DATOS
USE javasabado;


-- INSERTAMOS LA INFORMACION
INSERT INTO cursos (Descripcion) VALUES ('JAVA'),('PYTHON'),('SQL'),('JAVASCRIPT'),('REACT');

INSERT INTO empleados (TipoDocumento, NumeroDocumento, Nombre, Apellido, FechaNacimiento, FechaCargo, sueldo, Tipo) 
VALUES ('DNI',95853354,'Octavio','Robleto','1983-03-15','2021-01-01',25,4),('DNI',95877200,'Mariana','Bracho','1989-06-06','2021-01-01',25,4);

INSERT INTO tipoempleado (Descripcion) VALUES ('Alumno'),('Director'),('Profesor'),('Administrativo');