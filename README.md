# LiterAlura

## Descrição

LiterAlura é um projeto de catálogo de livros desenvolvido em Java que oferece interação textual via console com os usuários. Este projeto envolve realizar solicitações a uma API de livros, manipular dados JSON, armazená-los em um banco de dados PostgreSQL e exibir livros e autores de interesse.

## Objetivos

- Buscar livros através de uma API específica.
- Analisar e manipular dados JSON.
- Armazenar os dados em um banco de dados PostgreSQL.
- Fornecer interação textual com os usuários via console.
- Proporcionar pelo menos 5 opções de interação com o usuário.

## Funcionalidades

1. Buscar e salvar livros
2. Listar todos os livros
3. Buscar livros por autor
4. Buscar livros por título
5. Sair

## Pré-requisitos

- Java 17 ou superior
- Maven ou Gradle
- PostgreSQL
- IDE (IntelliJ IDEA recomendada)

## Configuração do Ambiente

1. **Instalar Java 17:**
   - [Download do JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
   - Configurar a variável de ambiente `JAVA_HOME`.

2. **Instalar PostgreSQL:**
   - [Download do PostgreSQL](https://www.postgresql.org/download/)

3. **Configurar o Banco de Dados:**
   - Crie um banco de dados chamado `literalura`.
   - Anote o nome de usuário e a senha.

4. **Configurar o Projeto:**
   - Clone este repositório.
   - Configure as dependências do Maven ou Gradle.
   - Configure o arquivo `application.properties` com as informações do seu banco de dados.

## Configuração do Projeto

### `application.properties`

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
```

### Dependências (Maven)

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <version>3.3.1</version>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10</version>
    </dependency>
    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.5.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>3.3.1</version>
    </dependency>
</dependencies>
```

## Estrutura do Projeto

- **ApiService:** Classe responsável por consumir a API de livros.
- **Livro:** Classe modelo que representa os livros.
- **LivroRepository:** Interface do Spring Data JPA para operações CRUD com a entidade Livro.
- **LiterAluraApplication:** Classe principal que inicia a aplicação e fornece a interação com o usuário via console.

## Execução do Projeto

1. **Compilar e executar:**
   - Execute o projeto através da sua IDE ou utilizando o Maven/Gradle no terminal.
   - No console, siga as instruções para interagir com o catálogo de livros.

2. **Interações com o Usuário:**
   - Escolha uma opção no menu exibido no console.
   - Siga as instruções fornecidas para cada opção.

## Exemplos de Uso

1. **Buscar e salvar livros:**
   - Esta opção buscará livros na API e salvará no banco de dados.

2. **Listar todos os livros:**
   - Exibe todos os livros armazenados no banco de dados.

3. **Buscar livros por autor:**
   - Solicita o nome do autor e exibe os livros correspondentes.

4. **Buscar livros por título:**
   - Solicita o título ou parte do título e exibe os livros correspondentes.

5. **Sair:**
   - Encerra a aplicação.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias.

## Licença

Este projeto está licenciado sob a licença MIT - consulte o arquivo [LICENSE](LICENSE) para obter detalhes.
