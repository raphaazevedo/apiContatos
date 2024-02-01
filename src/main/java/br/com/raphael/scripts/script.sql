--criar a tabela de categorias
create table categoria(
	id		uuid			primary key,
	nome		varchar(25)	not null unique
);

--criar a tabela de contatos
create table contato(
	id		uuid			primary key,
	nome		varchar(150)	not null,
	telefone	varchar(15)	not null,
	categoria_id	uuid			not null,
	foreign key(categoria_id)
		references categoria(id)
);
--cadastrar planos
insert into categoria(id, nome) 
values(gen_random_uuid(), 'Familiares');
insert into categoria(id, nome) 
values(gen_random_uuid(), 'Trabalho');
insert into categoria(id, nome) 
values(gen_random_uuid(), 'Academia');
insert into categoria(id, nome) 
values(gen_random_uuid(), 'Escola');


select * from categoria;
