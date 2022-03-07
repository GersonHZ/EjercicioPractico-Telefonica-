
CREATE DATABASE "Telefonica"

-- Tabla Estado : se puede tener mas de dos estados en el futuro
create table estado
(
	idestado serial,
	cdescripcion varchar
);

create unique index estado_idestado_uindex
	on estado (idestado);

alter table estado
	add constraint estado_pk
		primary key (idestado);



-- Tabla tipo documento: por el momento solo existen dos DNI y Carnet de Extranjeria
create table tipodocumento
(
	idtipodoc serial,
	cdescripcion char not null
);

create unique index tipodocumento_idtipodoc_uindex
	on tipodocumento (idtipodoc);

alter table tipodocumento
	add constraint tipodocumento_pk
		primary key (idtipodoc);

-- Tabla planes postpago
create table planes_postpago
(
	idplan serial,
	cdescripcion varchar,
	bestado boolean not null
);

create unique index planes_postpago_idplan_uindex
	on planes_postpago (idplan);

alter table planes_postpago
	add constraint planes_postpago_pk
		primary key (idplan);

-- Tabla tipo plan: (prepago, postpago)
create table tipoplan
(
	idtipoplan serial,
	cdescripcion varchar
);

create unique index tipoplan_idtipoplan_uindex
	on tipoplan (idtipoplan);

alter table tipoplan
	add constraint tipoplan_pk
		primary key (idtipoplan);


-- Tabla oferta: Historial de ofertas
create table oferta
(
	id serial,
	cdescripcion varchar not null,
	lineamovil int not null
		constraint linea_movil_estado_id_fk
			references linea_movil
				on update cascade on delete cascade,
	dinicio date not null,
	dfin date not null,
    bestado boolean
);

comment on column oferta.dinicio is 'fecha inicio oferta';

comment on column oferta.dfin is 'fecha fin oferta';

create unique index oferta_id_uindex
	on oferta (id);

alter table oferta
	add constraint oferta_pk
		primary key (id);

-- Tabla cliente: datos relevantes del usuario
create table cliente
(
	idcliente serial,
	cnombres char,
	capellidos char,
	idtipodoc int not null
		constraint cliente_tipodocumento_idtipodoc_fk
			references tipodocumento
				on update cascade on delete cascade,
	cdocumento char,
	dfecnac date,
	idestado int not null
		constraint cliente_estado_idestado_fk
			references estado
				on update cascade on delete cascade
);

create unique index cliente_idcliente_uindex
	on cliente (idcliente);

alter table cliente
	add constraint cliente_pk
		primary key (idcliente);

-- Tabla linea movil
create table linea_movil
(
	id serial,
	ntelefono int not null,
	cliente int not null
		constraint linea_movil_estado_idcliente_fk
			references cliente
				on update cascade on delete cascade,
	estado int not null
		constraint linea_movil_estado_idestado_fk
			references estado
				on update cascade on delete cascade,
	tipoplan int
		constraint linea_movil_tipoplan_idtipoplan_fk
			references tipoplan
				on update cascade on delete cascade,
	planpostpago int
		constraint linea_movil_planes_postpago_idplan_fk
			references planes_postpago
				on update cascade on delete cascade,
);

create unique index linea_movil_id_uindex
	on linea_movil (id);

alter table linea_movil
	add constraint linea_movil_pk
		primary key (id);



