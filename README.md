$ docker run --name mysql1 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql:tag
# ntkSG

Templates
- pre-screen
- screen
- pos-screen
- pre-field
- field
- pos-field

Entity
- version: boolean;
- number of version: zero for infinite
- Regulatory
  - LGPD (Lei geral de proteção de dados)
  - Audit
  - SCIM 2.0
  - oAuth

Field properties
- name
- description
- type: enum Integer, String
- required: boolean
- regex validation: string
- Non-Public Information: boolean
- SOX: boolean
- size:
- decimal: Integer for numeric fields only
- encrypt

Download and install docker
docker pull mysql/mysql-server:latest
docker run -p 3306:3306 --name=mysql1 -d mysql/mysql-server:latest

docker exec -it mysql1 mysql -uroot -p
ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
update mysql.user set host = '%' where user='root';
docker restart mysql1

#To do
multiple fields filter per entity

entities - historic changes
entities - maker and checker

app - multi language

groups for entitlements

Para a tarefa1 ser iniciada
update TAREFA set situacao='PENDENTE' where id=178

SELECT * FROM TAREFA 

SELECT * FROM TEMPLATE 

INSERT INTO TEMPLATE
(ID , INPUT_TEMPLATE_PATH , NAME , OUTPUT_PATH     , FILE_NAME)VALUES
(123 ,'templates/react/index.jsx','pages','react/src/pages/','${entidade.pluralNameLower}')

UPDATE TEMPLATE
SET FILE_NAME='${entidade.pluralNameLower}.jsx'
WHERE ID = 123

UPDATE TEMPLATE
SET INPUT_TEMPLATE_PATH='templates/react/index.jsx.vm'
WHERE ID = 123
