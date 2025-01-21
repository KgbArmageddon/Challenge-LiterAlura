# Challenge-LiterAlura
# Catálogo de Livros

Projeto desenvolvido como parte do Challenge Literalura, utilizando Spring Boot para criar um sistema de catálogo de livros. Este projeto permite interagir com um banco de dados que armazena informações sobre livros e seus autores, com várias opções de consulta e estatísticas.

## Funcionalidades

1. **Buscar livro pelo título**: Permite buscar um livro no banco de dados informando o título.
2. **Listar livros registrados**: Exibe uma lista de todos os livros cadastrados no banco de dados.
3. **Listar autores registrados**: Mostra todos os autores cadastrados no sistema.
4. **Listar autores vivos em determinado ano**: Permite listar autores que estavam vivos em um ano específico.
5. **Listar livros em um determinado idioma**: Exibe livros cadastrados filtrados por idioma.
6. **Exibir estatísticas**: Mostra a quantidade de livros em um idioma específico utilizando consultas derivadas.

## Configuração do Ambiente

### Pré-requisitos
- Java 17+
- Maven
- Banco de Dados H2
- IDE (IntelliJ, VS Code)
- Gutendex
  
### Passos para Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/SeuUsuario/catalogo-livros.git
   ```

2. Acesse o diretório do projeto:
   ```bash
   cd catalogo-livros
   ```

3. Configure o ambiente Java e importe o projeto em sua IDE como um projeto Maven.

4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse o H2 Console para visualizar o banco de dados em memória:
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Usuário: `sa`
   - Senha: `password`

## Estrutura do Projeto

```plaintext
catalogo-livros/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/literatura/
│   │   │       ├── CatalogoLivrosApplication.java
│   │   │       ├── controller/
│   │   │       │   └── MenuController.java
│   │   │       ├── service/
│   │   │       │   └── LivroService.java
│   │   │       ├── repository/
│   │   │       │   ├── LivroRepository.java
│   │   │       │   └── AutorRepository.java
│   │   │       ├── model/
│   │   │       │   ├── Livro.java
│   │   │       │   └── Autor.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       └── data.sql
│   ├── test/
│       └── java/
│           └── com/literatura/
│               └── CatalogoLivrosApplicationTests.java
```

## Endpoints Principais

- **Menu**: `GET /menu` - Exibe as opções disponíveis para interação.
- **Buscar Livro por Título**: `GET /livros/titulo/{titulo}`
- **Listar Livros**: `GET /livros`
- **Listar Autores**: `GET /autores`
- **Listar Autores Vivos**: `GET /autores/vivos/{ano}`
- **Listar Livros por Idioma**: `GET /livros/idioma/{idioma}`

## Tecnologias Utilizadas

- **Linguagem**: Java 17
- **Framework**: Spring Boot
- **Banco de Dados**: H2 (em memória)
- **Maven**: Gerenciador de dependências

## Contribuição

Se desejar contribuir com melhorias ou correções, sinta-se à vontade para criar um fork do projeto, fazer as alterações e enviar um pull request.

## Licença

Este projeto é licenciado sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

---

Projeto criado para o desafio do Challenge Literalura.
