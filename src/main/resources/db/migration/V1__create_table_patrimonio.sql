create table patrimonio(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    estado tinyint default 1,

    primary key (id)
);