insert into regiones (id, nombre) values (1, 'centroamerica');
insert into regiones (id, nombre) values (2, 'norteamerica');
insert into regiones (id, nombre) values (3, 'sudaamerica');
insert into regiones (id, nombre) values (4, 'europa');
insert into regiones (id, nombre) values (5, 'asia');
insert into regiones (id, nombre) values (6, 'africa');
insert into regiones (id, nombre) values (7, 'oceania');
insert into regiones (id, nombre) values (8, 'antartida');

insert into clientes (region_id, nombre, apellido, email, fecha) values(2, 'Ivan','Moreno','ivanmoreno@sinbad.com','2020-08-03');
insert into clientes (region_id, nombre, apellido, email, fecha) values(3, 'carlos','Moreno','carlos@sinbad.com','2020-03-08');
insert into clientes (region_id, nombre, apellido, email, fecha) values(4, 'bolt','cafe','boltcafe@sinbad.com','2020-11-03');
insert into clientes (region_id, nombre, apellido, email, fecha) values(4, 'rocke','blanco','rockeblanco@sinbad.com','2020-11-08');
insert into clientes (region_id, nombre, apellido, email, fecha) values(1, 'emma','mireya','emma@sinbad.com','2020-06-03');
insert into clientes (region_id, nombre, apellido, email, fecha) values(1, 'marce','marcela','marcela@sinbad.com','2020-09-03');


insert into usuarios (username, password, enabled, nombre, apellido, email) values ('ivan', '$2a$10$U13rCJ/YRndta.7ASIhwS.yqT4KXKemSm7CK7O8skJrTYyRtrE7Hq', 1, 'carlos', 'moreno', 'ivansinbad@gmail.com');
insert into usuarios (username, password, enabled, nombre, apellido, email) values ('admin', '$2a$10$fSzqQcXQqZ3IbdGCERLwLukhuM8woO7w.ZhmHylA/NrnAceJDHJjO', 1, 'john', 'doe', 'johndoe@gmail.com');

insert into roles (nombre) values ('ROLE_USER');
insert into roles (nombre) values ('ROLE_ADMIN');

insert into administracion (id_user, id_role) values (1, 1);
insert into administracion (id_user, id_role) values (2, 2);
insert into administracion (id_user, id_role) values (2, 1);

insert into productos (nombre, precio, create_at) values ('monitor', 35600, NOW());
insert into productos (nombre, precio, create_at) values ('PC', 300000, NOW());
insert into productos (nombre, precio, create_at) values ('lapiz', 10, NOW());
insert into productos (nombre, precio, create_at) values ('cuaderno', 35, NOW());
insert into productos (nombre, precio, create_at) values ('lampara', 300, NOW());

insert into facturas (descripcion, observacion, cliente_id, create_at) values('Factura prueba 1', null, 1, NOW());
insert into facturas (descripcion, observacion, cliente_id, create_at) values('Factura prueba 2', null, 1, NOW());

insert into facturas_items(cantidad, factura_id, producto_id) values (1, 1, 1);
insert into facturas_items(cantidad, factura_id, producto_id) values (10, 1, 2);
insert into facturas_items(cantidad, factura_id, producto_id) values (5, 1, 3);
insert into facturas_items(cantidad, factura_id, producto_id) values (9, 1, 4);

insert into facturas_items(cantidad, factura_id, producto_id) values (3, 2, 5);

