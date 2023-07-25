### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto MovieFlix Review [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/movieflix_review_backend/blob/main/LICENSE)

MovieFlix Review foi desenvolvido no curso Bootcamp Spring proposto pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

A aplicação oferece aos usuários uma plataforma para buscar filmes e adicionar comentários sobre eles, com recursos de autenticação, autorização, operações CRUD completas com tratamento de exceções, testes unitários e de integração para assegurar a qualidade do código.

Os usuários membros podem adicionar comentários aos filmes, tendo acesso a essa funcionalidade por meio de um controle de acesso baseado no tipo de perfil do usuário cadastrado.

# Teste as requisições no Postman Collection
#### Projeto disponível na plataforma de hospedagem Railway - Requisições automáticas prontas para uso, sem necessidade de clonar o projeto
#### Siga o passo a passo:
1) Clique no botão "Run in Postman"
2) Acesse a opção "View collection"
3) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-7df280e6-b7cd-40ae-9c00-59bd9f92a7df?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-7df280e6-b7cd-40ae-9c00-59bd9f92a7df%26entityType%3Dcollection%26workspaceId%3D23afc38e-34e2-4f9b-9072-4d3c99cc6ff0#?env%5BGlobal%5D=W3sia2V5IjoiaG9zdCIsInZhbHVlIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6ImNsaWVudC1pZCIsInZhbHVlIjoibXljbGllbnRpZCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJjbGllbnQtc2VjcmV0IiwidmFsdWUiOiJteWNsaWVudHNlY3JldCIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJ1c2VybmFtZSIsInZhbHVlIjoiYWxleEBnbWFpbC5jb20iLCJlbmFibGVkIjp0cnVlLCJ0eXBlIjoiZGVmYXVsdCJ9LHsia2V5IjoicGFzc3dvcmQiLCJ2YWx1ZSI6IjEyMzQ1NiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In0seyJrZXkiOiJ0b2tlbiIsInZhbHVlIjoiIiwiZW5hYmxlZCI6dHJ1ZSwidHlwZSI6ImRlZmF1bHQifSx7ImtleSI6InJlZnJlc2hfdG9rZW4iLCJ2YWx1ZSI6IiIsImVuYWJsZWQiOnRydWUsInR5cGUiOiJkZWZhdWx0In1d)

## Login endpoints
#### Escolha o ambiente do projeto: "movieFlixReview" (lembre-se de substituir os emails para login)

`POST` Permite efetuar o login de um usuário. Utilize as seguintes credenciais para teste:
- ana@gmail.com
  - Funções: "ROLE_MEMBER"
  - Acesso: Liberado

- bob@gmail.com
  - Funções: "ROLE_VISITOR"
  - Acesso: Restrito
 
## User endpoints
`GET Logged / by ID`
- Acesso permitido para usuários logados com função "ROLE_VISITOR" e "ROLE_MEMBER"
- Retorna informações do usuário logado
- Retorna apenas informações do próprio usuário (usando seu próprio ID), impedindo acesso a outros IDs de usuário

## Movie / Genre endpoints
`GET Movie by ID / Movie reviews by ID / Movies by genre / List all genres`
- Acesso permitido para usuários logados com função "ROLE_VISITOR" e "ROLE_MEMBER"
- Retorna informações de um filme específico com base no ID fornecido
- Retorna uma lista de comentários de um filme específico com base no ID fornecido, incluindo detalhes sobre o usuário que fez cada comentário
- Retorna uma lista paginada de filmes de um gênero específico com base no ID fornecido
- Retorna uma lista de todos os gêneros disponíveis

`POST Review`
- Acesso permitido para usuários logados com função "ROLE_MEMBER"
- Permite criar um comentário para um filme específico com base no ID fornecido, incluindo detalhes sobre o usuário que fez o comentário

# Tecnologias | Implantação em produção
- Java, Spring Boot, Spring Cloud, Spring Security, Validation, OAuth2, JWT, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git, JUnit5, Mockito e MockBean
- Implantação backend: Railway
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Paginação de Dados: Implementa técnicas de paginação para otimizar o desempenho e viabilizar a navegação eficiente em conjuntos de dados extensos.
- Validação de Dados: Realiza validação de dados utilizando o Bean Validation para garantir conformidade com os requisitos especificados.
- Autenticação e Autorização: Implementa OAuth2 e JWT para autenticação e autorização segura dos usuários.
- Refresh Token e Password Token: Utiliza tokens para garantir a autenticação contínua e segura dos usuários, permitindo a renovação do acesso e a redefinição da senha de forma segura.
- Autorizações Personalizadas: Realiza pré-autorização de métodos sensíveis, restringindo o acesso apenas a usuários autorizados.
- Consultas ao Banco de Dados com JPQL: Realiza consultas ao banco de dados utilizando a linguagem de consulta JPQL.
- Testes Automatizados: Compreende testes unitários e de integração que abrangem as camadas de serviço e controlador. Utiliza JUnit para testar repositórios, serviços e recursos, além de simular dependências com Mockito e MockBean, garantindo verificações precisas dos resultados.

## Figma Frontend
https://www.figma.com/file/6JQVnxKgKtVHLleSBBgRin/MovieFlix-front-listagem?type=design&node-id=0-1&mode=design&t=JwPUQBkwju1kPqYE-0

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/movieflix_review_assets/modelo_conceitual_ok.jpg?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
