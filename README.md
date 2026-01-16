# Spring Design Patterns JWT

Este projeto é uma aplicação **Spring Boot** focada na implementação de segurança com **JWT (JSON Web Token)** e aplicação de padrões de design de software.

## 🚀 Tecnologias Utilizadas

*   **Java**
*   **Spring Boot**
*   **Spring Security**
*   **JWT** (para autenticação Stateless)
*   **Maven/Gradle** (Gerenciamento de dependências)

## 🛡️ Segurança e Autenticação

O projeto utiliza um filtro de segurança personalizado para validar tokens JWT em cada requisição.

### JwtFilter

O arquivo `JwtFilter.java` intercepta as requisições HTTP para verificar a presença de um cabeçalho `Authorization`.

1.  Verifica se o cabeçalho começa com `Bearer `.
2.  Extrai o token.
3.  Valida o usuário através do `JwtUtil`.
4.  Autentica o usuário no contexto de segurança do Spring (`SecurityContextHolder`).

## ⚙️ Como Executar

1.  Clone este repositório.
2.  Configure as variáveis de ambiente ou o arquivo `application.properties` com o segredo do JWT.
3.  Compile e execute o projeto:

```bash
# Se estiver usando Maven
./mvnw spring-boot:run
```

## 🔌 Uso da API

Para acessar rotas protegidas, é necessário enviar o token no cabeçalho da requisição:

**Header:** `Authorization`
**Value:** `Bearer <SEU_TOKEN_JWT>`

## 📝 Licença

Este projeto está sob a licença MIT.