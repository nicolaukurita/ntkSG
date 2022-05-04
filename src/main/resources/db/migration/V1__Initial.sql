/*
CREATE SCHEMA `sgdb` ;

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

INSERT INTO sgdb.usuario (first_name, last_name) VALUES ('Nicolau','Kurita');
INSERT INTO sgdb.projeto (nome) VALUES ('ntkSGC');
INSERT INTO sgdb.tarefa (nome, projeto_id,situacao) VALUES ('teste',1,'PENDENTE');
INSERT INTO `sgdb`.`entidade` (`id`, `alterar`, `consultar`, `descricao`, `excluir`, `incluir`, `nome`, `projeto_id`) VALUES ('1', b'1', b'1', 'Usuario', b'1', b'1', 'Usuario', b'1');
INSERT INTO `sgdb`.`campo` (`id`, `nome`, `tipo`, `entidade_id`) VALUES ('1', 'Id', 'text', '1');
INSERT INTO `sgdb`.`campo` (`id`, `nome`, `tipo`, `entidade_id`) VALUES ('2', 'Nome', 'text', '1');
select * from sgdb.tarefa;
update projeto
set PROJECT_PATH ='h:/lixo'
;
update tarefa set SITUACAO ='PENDENTE';
;

*/
INSERT INTO usuario (first_name, last_name) VALUES ('Nicolau','Kurita');
INSERT INTO projeto (nome,titulo, FRONT_END_TYPE ,ANGULAR_APP_NAME, PROJECT_PATH)
VALUES ('apm','Acme Product Management','ANGULAR','pm','h:/lixo');
INSERT INTO tarefa (nome, projeto_id,situacao) VALUES ('teste',1,'PENDENTE');
INSERT INTO entidade (id, alterar, consultar, descricao, excluir, incluir, nome, projeto_id) VALUES (1, true, true, 'Usuario', true, true, 'Usuario', true);
INSERT INTO campo (id, nome, tipo, entidade_id) VALUES (1, 'Id', 'text', 1);
INSERT INTO campo (id, nome, tipo, entidade_id) VALUES (2, 'Nome', 'text', 1);
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH )
VALUES('html add for component','templates/projeto/add.vm','angular/src/app','teste.html');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME)
VALUES('application component','templates/projeto/component.vm', 'angular/src/app', 'app.component.ts')

/*
select * from usuario     ;
select * from projeto     ;
select * from tarefa      ;
select * from entidade    ;
select * from campo       ;
select * from Template    ;

*/