# Adicionar Swagger
## Pesquisar maven openapi
https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-ui</artifactId>
    <version>1.8.0</version>
</dependency>
adicionar no pom.xml

## SpringDoc OpenAPI Starter WebMVC UI
<!-- https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui -->
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>3.0.0-M1</version>
</dependency>

## Adicionar no xxxApplication.java
@OpenAPIDefinition(info = @Info(title = "Pet Shop Application", version = "1", description = "Point of Sale application for PET Shop"))

## no controller

## na classe
@Tag(name = "loja-api")

## nos metodos
@PostMapping
@Operation(summary = "Salva o produto", method = "POST")
@ApiResponses(value = {
@ApiResponse(responseCode = "200", description = "Produto adicionado com sucesso"),
@ApiResponse(responseCode = "400", description = "Parametros inválidos"),
@ApiResponse(responseCode = "401", description = "Usuário não autenticado"),
@ApiResponse(responseCode = "500", description = "Erro ao salvar o produto")
})

## Nos parametros
logo após @RequestParam, colocar descrição do parametro conforme abaixo
public ResponseEntity<Produto> buscarProdutoPorGtin(@RequestParam("GTIN") String gtin) {

# Para receber um arquivo no controller

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadDocuments(@RequestPart MultipartFile file){
//        log.info
return null;
}

# Criar um projeto react
npx create-react-app gerenciador-filmes-react

## executar o projeto
entrar na pasta do projeto
npm start

##  Adicionar o projeto no GIT.
### Criar o projeto no GitHub
- git remote add origin git@github.com:nicolaukurita/gerenciador-filmes-react.git
criar a branch
- git branch -M main
enviar os arquivos
- git push -u origin main

### toda vez que fizer alteração no projeto
git add .
git commit -m "Limpeza do projeto"
git push

# Gerar um novo SSH key
ssh-keygen -t ed25519 -C "nicolau@etematica.com.br"

# Para incluir um fonte no css
pesquisar google fonts
@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;700&display=swap');

# Criar um projeto react por framework
npm create vite@latest my-app -- --template react
pnpm dlx create-next-app@latest

# instalando o pnpm
npx pnpm@latest-10 dlx @pnpm/exe@latest-10 setup


# Criar um projeto react
npx create-react-app sgc-app

npm i react-router-dom

git remote add origin git@github.com:nicolaukurita/sgc-app.git
git branch -M main
git push -u origin main

os proximos são:
git add .
git commit -m "Comentário"
git push

para usar icons precisa instalar 
npm install react-icons

para usar o axios
npm install axios

para usar o Link, precisa alterar no src\index.jsx para
<BrowserRouter>
<App />
</BrowserRouter>
e importar import { BrowserRouter } from 'react-router-dom';
