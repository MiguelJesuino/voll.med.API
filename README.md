# voll.med.API

API REST desenvolvida com **Spring Boot** (Java) para gerenciar informações de médicos, pacientes e consultas por meio de operações CRUD. Ideal para aprendizado ou como base para sistemas de gestão clínica.

## Sumário
- [Sobre](#sobre)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Endpoints Principais](#endpoints-principais)
- [Autenticação (JWT)](#autenticação-jwt)
- [Contribuição](#contribuição)
- [Licença](#licença)

## Sobre
Esta é uma API REST construída com Spring Boot que possibilita a criação, leitura, atualização e exclusão de registros de médicos — compondo um backend funcional para um sistema clínico fictício.

## Funcionalidades
- Cadastro, listagem, edição e remoção de médicos
- Autenticação via **JWT** para segurança de endpoints (se implementada)
- Validação de dados via Bean Validation

## Tecnologias Utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Spring Security (JWT)
- Bean Validation (Hibernate Validator)
- Banco de dados (MySQL, PostgreSQL, H2)
- Maven ou Gradle


Configurar `application.properties`:
\`\`\`properties
spring.datasource.url=jdbc:mysql://localhost:3306/vollmed
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
\`\`\`

Executar:
\`\`\`sh
mvn spring-boot:run
\`\`\`

## Endpoints Principais
### Médicos
| Método | Rota            | Descrição |
|--------|-----------------|-----------|
| POST   | `/medicos`      | Cadastrar médico |
| GET    | `/medicos`      | Listar médicos |
| GET    | `/medicos/{id}` | Buscar médico por ID |
| PUT    | `/medicos/{id}` | Atualizar médico |
| DELETE | `/medicos/{id}` | Excluir médico |


## Autenticação (JWT)
- `POST /login` retorna token JWT
- Header:
\`\`\`
Authorization: Bearer <token>
\`\`\`

## Contribuição
1. Fork no repositório
2. Crie branch: `git checkout -b feature/nova-funcionalidade`
3. Commit: `git commit -m "Descrição da mudança"`
4. Push: `git push origin feature/nova-funcionalidade`
5. Abra Pull Request

## Licença
MIT License
