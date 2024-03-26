CREATE TABLE livro(
	id bigint primary key not null,
	titulo varchar(220) NOT null,
	autor varchar(220) NOT null,
	ano_publicacao integer NOT null
);

CREATE TABLE membro(
	id bigint primary key not null,
	nome varchar(220) NOT null,
	endereco varchar(255) NOT null,
	telefone varchar(15) NOT null
);

CREATE TABLE emprestimo(
	id bigint primary key,
	livro_id bigint,
	membro_id bigint,
	data_emprestimo date not null,
	data_devolucao date not null,
	foreign key (livro_id) references livro (id),
	foreign key (membro_id) references membro (id)
);

CREATE TABLE bibliotecario (
	id bigserial primary key not null,
	nome varchar(220) NOT null,
	email varchar(255) NOT null,
	senha varchar(15) NOT null
);

CREATE TABLE visitante (
	id bigserial primary key not null,
	nome varchar(220) NOT null,
	telefone varchar(15) NOT null
);
