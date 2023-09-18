# PROJETO IBM

Este é um projeto de API Spring Boot desenvolvido no IntelliJ IDEA, onde aplicamos os conhecimentos adquiridos no bootcamp para expor uma regra de negócio relacionada ao gerenciamento de jogadores e times.

## Endpoints

- **POST /jogador**
    - Cria um novo jogador.
    - Corpo da Requisição: `{ "nome": "Nome Sobrenome" }`
    - Retorno Esperado: Status 2xx OK com corpo vazio.
  

- **GET /times**
    - Retorna a lista de times com seus jogadores.
    - Retorno Esperado: Status 2xx OK com corpo no formato:
      ```json
      {
        "time1": ["Nome Sobrenome", "Nome Sobrenome", "Nome Sobrenome"],
        "time2": ["Nome Sobrenome", "Nome Sobrenome"]
      }
      ```

- **DELETE /jogador/all**
    - Remove todos os jogadores, reiniciando a base de dados para montar novos times.
    - Retorno Esperado: Status 2xx OK com corpo vazio.

## Dependências

Este projeto utiliza as seguintes dependências do Spring Boot:

```xml
 - spring-boot-starter-data-jpa
 - boot-starter-web
 - h2 (runtime)
 - lombok (optional)
 - spring-boot-starter-test (test)
```
## Como Utilizar

### Clone o Repositório

Clone este repositório em sua máquina local:

```bash
git clone https://github.com/NathaliaRezendet/IBM.git
```
**Importe o Projeto no IntelliJ IDEA**

1. Abra o IntelliJ IDEA.
2. Selecione "File" > "Open" e navegue até o diretório onde você clonou o repositório.
3. Selecione a pasta do projeto e clique em "Open".
4. O IntelliJ IDEA deve detectar o projeto como um projeto Spring Boot e configurar automaticamente.

**Execute o Projeto**

Você pode executar o projeto a partir do IntelliJ IDEA clicando com o botão direito do mouse no arquivo principal do aplicativo (geralmente chamado de `Application.java`) e escolhendo a opção "Run".

**Tecnologias Utilizadas**

- Spring Boot
- Java
- IntelliJ IDEA

**Desenvolvedora**

Desenvolvido por Nathalia Rezende.

**Licença**

Copyright (c) 2023 Nathalia Rezende

Esse projeto está sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.
