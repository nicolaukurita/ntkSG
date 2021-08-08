/*
create table campo (
         id integer not null,
          nome varchar(255),
          tipo varchar(255),
          primary key (id)
      ) engine=InnoDB

    create table entidade (
       id integer not null,
        alterar bit not null,
        consultar bit not null,
        descricao varchar(255),
        excluir bit not null,
        incluir bit not null,
        nome varchar(255),
        projeto_id integer not null,
        primary key (id)
    ) engine=InnoDB

    create table hibernate_sequence (
       next_val bigint
    ) engine=InnoDB

    insert into hibernate_sequence values ( 1 )

    create table projeto (
       id integer not null,
        nome varchar(255),
        primary key (id)
    ) engine=InnoDB

    create table projeto_usuario (
       usuario_id integer not null,
        project_id integer not null,
        primary key (usuario_id, project_id)
    ) engine=InnoDB

    create table tarefa (
       id integer not null,
        inicio datetime(6),
        nome varchar(255),
        projeto_id integer,
        situacao varchar(255),
        termino datetime(6),
        primary key (id)
    ) engine=InnoDB

    create table usuario (
       id integer not null,
        first_name varchar(255),
        last_name varchar(255),
        primary key (id)
    ) engine=InnoDB

    alter table entidade
       add constraint FKentidade_projeto_id
       foreign key (projeto_id)
       references projeto (id)

    alter table projeto_usuario
       add constraint FKprojeto_usuario_project_id
       foreign key (project_id)
       references projeto (id)

    alter table projeto_usuario
       add constraint FKprojeto_usuario_usuario_id
       foreign key (usuario_id)
       references usuario (id)

INSERT INTO usuario (id, first_name, last_name) VALUES (1,'Nicolau','Kurita');
INSERT INTO projeto (id, nome) VALUES (1, 'ntkSGC');
*/