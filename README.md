Critérios de correção:
Mínimo para aprovação: 12 de 15
- GET /genres deve retornar 401 para token inválido

- GET /genres deve retonar 200 com todos gêneros para VISITOR logado

- GET /genres deve retonar 200 com todos gêneros para MEMBER logado

- GET /movies/{id} deve retornar 401 para token inválido

- GET /movies/{id} deve retornar 200 com o filme para VISITOR logado

- GET /movies/{id} deve retornar 200 com o filme para MEMBER logado

- GET /movies/{id} deve retornar 404 para id inexistente

- GET /movies deve retornar 401 para token inválido

- GET /movies deve retornar 200 com página ordenada de filmes para VISITOR logado

- GET /movies deve retornar 200 com página ordenada de filmes para MEMBER logado

- GET /movies?genreId={id} deve retornar 200 com página ordenada de filmes filtrados por gênero

- POST /reviews deve retornar 401 para token inválido

- POST /reviews deve retornar 403 para VISITOR logado

- POST /reviews deve retornar 201 com objeto inserido para MEMBER logado e dados válidos

- POST /reviews deve retornar 422 para MEMBER logado e dados inválidos

Competências avaliadas:
- Desenvolvimento TDD de API Rest com Java e Spring Boot

- Realização de casos de uso

- Consultas a banco de dados relacional com Spring Data JPA

- Tratamento de erros com respostas HTTP customizadas

- Controle de acesso por perfil de usuário e rotas
