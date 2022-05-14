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

;

*/
INSERT INTO usuario (first_name, last_name) VALUES ('Nicolau','Kurita');
INSERT INTO projeto (nome,titulo, FRONT_END_TYPE ,ANGULAR_APP_NAME, PROJECT_PATH)
VALUES ('apm','Acme Product Management','ANGULAR','pm','h:/lixo');
INSERT INTO tarefa (nome, projeto_id,situacao) VALUES ('teste',1,'PENDENTE');

delete from entidade;
INSERT INTO entidade (id, alterar, consultar, descricao, excluir, incluir, nome, projeto_id, PLURAL_NAME, NAME_LOWER, PLURAL_NAME_LOWER )
VALUES (1, true, true, 'Product', true, true, 'Product', true, 'Products','product','products');

delete from campo;
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE) VALUES (1, 'productId', 'Product Id', 'number', 1, 10, 'O');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE, HAS_FILTER) VALUES (2, 'productName', 'Product', 'text', 1, 30, 'IO', TRUE);
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE, OUTPUT_FORMAT) VALUES (3, 'productCode', 'Code', 'text', 1, 40, 'IO','| lowercase');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE) VALUES (4, 'releaseDate', 'Available', 'text', 1, 50, 'IO');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE, OUTPUT_FORMAT) VALUES (5, 'price', 'Price', 'number', 1, 60, 'IO','| currency:"USD":"symbol":"1.2-2"');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE) VALUES (6, 'description', 'Description', 'text', 1, 70, 'O');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE) VALUES (7, 'starRating', '5 Star Rating', 'number', 1, 80, 'IO');
INSERT INTO campo (id, nome, display_name, tipo, entidade_id, FIELD_ORDER, INPUT_OUTPUT_TYPE, IMAGE_MARGIN, IMAGE_WIDTH, IMAGE_TITLE) VALUES (8, 'imageUrl', 'Show Image', 'imageUrl', 1, 20, 'IO', 2, 20, 'productName');



/*
delete from TEMPLATE;
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME)
VALUES('application html','templates/projeto/component.html','angular/src/app','app.component.html');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME)
VALUES('application ts component','templates/projeto/component.ts', 'angular/src/app', 'app.component.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('html list for component','templates/entidade/component-list.html','angular/src/${entidade.nameLower}','${entidade.nameLower}-${tipo}.component.html');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('ts list for component','templates/entidade/component-list.ts','angular/src/${entidade.nameLower}','${entidade.nameLower}-${tipo}.component.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('html detail for component','templates/entidade/detail.component.html','angular/src/${entidade.nameLower}','${entidade.nameLower}-detail.component.html');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('ts detail for component','templates/entidade/detail.component.ts','angular/src/${entidade.nameLower}','${entidade.nameLower}-detail.component.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('application module ts','templates/projeto/app.module.ts','angular/src/app','app.module.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('component interface ts','templates/entidade/interface.ts','angular/src/${entidade.nameLower}','${entidade.nameLower}.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('component service ts','templates/entidade/service.ts','angular/src/${entidade.nameLower}','${entidade.nameLower}.service.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('welcome component ts','templates/projeto/welcome.component.ts','angular/src/home','welcome.component.ts');
INSERT INTO TEMPLATE (NAME,INPUT_TEMPLATE_PATH,OUTPUT_PATH,FILE_NAME )
VALUES('welcome component html','templates/projeto/welcome.component.html','angular/src/home','welcome.component.html');


update TEMPLATE
set OUTPUT_PATH ='angular/src/${entidade.nome}',
FILE_NAME ='${entidade.nome}-${tipo}.component.html'
where id=3;

update ENTIDADE
set NAME_LOWER ='product'
,PLURAL_NAME_LOWER ='products'
;

update TEMPLATE
set INPUT_TEMPLATE_PATH ='templates/entidade/component-list.html'
,FILE_NAME ='${entidade.nome}-${tipo}.component.html'
where id =3;

update tarefa set SITUACAO ='PENDENTE';

delete from tarefa;
select * from usuario     ;
select * from projeto     ;
select * from tarefa      ;
select * from entidade    ;
select * from campo       ;
select * from Template    ;

*/