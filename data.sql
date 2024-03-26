insert into livro (id, titulo, autor, ano_publicacao)
values (1, 'Inteligência Emocional', 'Daniel Goleman', 1995),
		(2, 'Romeu e Julieta', 'William Shakespeare', 1591),
		 (3, 'Trono de Vidro', 'Sarah J.Maas', 2013);
		 
insert into membro (id, nome, endereco, telefone)
values (1, 'Erick', 'Santa Catarina', '(48) 99203-6533'),
		(2, 'Isabelle', 'Minas Gerais', '(48) 99203-6533'),
		 (3, 'Lucas', 'Rio Grande do Sul', '(48) 99203-6533');
		 
insert into membro (id, livro_id, membro_id, data_emprestimo, data_devolucao)
values (1, 1, 1, '2019-01-20', '2055-10-01'),
		(2, 2, 2, '2020-01-20', '2075-10-01'),
		 (3, 3, 3, '1990-01-20', '2007-10-01');
		 
insert into bibliotecario (id, nome, email, senha)
values (1, 'Erick', 'erick@gmail.com', '1253'),
		(2, 'Isabelle', 'isabelle@gmail.com', '1253'),
		 (3, 'Lucas', 'lucas@gmail.com', '1253');
		 
insert into visitante (id, nome, telefone)
values (1, 'Marcos', 'marcos@gmail.com', '(48) 9932-9633'),
		(2, 'Ruy', 'ruy@gmail.com', '(48) 9932-9633'),
		 (3, 'Vitor', 'vitor@gmail.com', '(48) 9932-9633');