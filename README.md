# 📝 Atividade Prática – Biblioteca de Jogos Pessoais com Spring Boot

## 🎯 Objetivo

Desenvolver uma **aplicação Web Full Stack** (Frontend + Backend) utilizando **Spring Boot**, com persistência em banco de dados e interface simples em **Thymeleaf**, que funcione como uma **Biblioteca de Jogos Pessoais**.

O sistema deverá permitir **cadastrar, listar, editar e remover** jogos e categorias, além de implementar recursos visuais (tema Dark/Light e rodapé com informações do desenvolvedor).

---

## ⚙️ Configuração do Projeto

Crie o projeto no **Spring Initializr** com as seguintes configurações:

* **Project:** Maven Project  
* **Language:** Java  
* **Spring Boot:** versão mais recente (ex.: 3.3.x)  
* **Group:** `br.com.bibliotecajogos`  
* **Artifact:** `bibliotecajogos`  
* **Packaging:** Jar  
* **Java:** 21  

### Dependências

Adicione as seguintes dependências:

* Spring Web  
* Thymeleaf  
* Spring Data JPA  
* H2 Database  
* PostgreSQL Driver  

---

## 📂 Modelagem dos Dados

### Entidade **Categoria**

* `id` (Long, PK)  
* `nome` (String)  
* `descricao` (String)  
* `iconeUrl` (String)  
* `dataCriacao` (LocalDateTime)  
* `dataAtualizacao` (LocalDateTime)  
* `ativo` (boolean)  

### Entidade **Jogo**

* `id` (Long, PK)  
* `titulo` (String)  
* `autor` (String)  
* `anoPublicacao` (Integer)  
* `genero` (String)  
* `descricao` (String)  
* `plataforma` (String)  
* `tempoEstimado` (Integer – horas)  
* `dataLancamento` (LocalDate)  
* `nota` (Double – 0 a 10)  
* `dificuldade` (Enum: FÁCIL, MÉDIO, DIFÍCIL)  
* `multiplayer` (boolean)  
* `preco` (BigDecimal)  
* `lojaUrl` (String – link para Steam, PSN, etc.)  
* `urlCapa` (String – imagem do jogo)  
* `finalizado` (boolean)  
* `dataAdicionado` (LocalDate)  
* `dataFinalizacao` (LocalDate)  
* `categoria` (Relacionamento ManyToOne)  

---

## 🎨 Requisitos Visuais

* Implementar **tema Dark/Light** com botão de alternância.  
* Adicionar um **rodapé fixo** contendo:  
  * Nome completo do desenvolvedor  
  * Link para o GitHub  

---

## ▶️ Como executar o projeto

### Ambiente local (H2)
```bash
# Clonar o repositório
git clone https://github.com/SeuUsuario/biblioteca-de-jogos.git
cd biblioteca-de-jogos

# Rodar
./mvnw spring-boot:run
# ou
mvn spring-boot:run
```
A aplicação iniciará em **http://localhost:8080**

### Console do H2 (opcional)
- URL: http://localhost:8080/h2-console  
- JDBC URL: `jdbc:h2:file:./data/biblioteca`  
- Usuário: `sa`  
- Senha: *(vazia)*

---

## 🚀 Deploy e Publicação

1. Publique o projeto no **GitHub** (repositório público).  
2. Faça o **Deploy no Render** (backend) e no **Neon** (PostgreSQL em nuvem).  
   * Configure as variáveis de ambiente:  
     ```
     SPRING_PROFILES_ACTIVE=prod
     SPRING_DATASOURCE_URL=jdbc:postgresql://<host>:<port>/<db>
     SPRING_DATASOURCE_USERNAME=<user>
     SPRING_DATASOURCE_PASSWORD=<pass>
     ```
   * Build Command: `./mvnw -DskipTests package`  
   * Start Command: `java -jar target/*.jar`  
   * Runtime: Java 21  
   * Nome do serviço: `bibliotecajogos-MatheusChiqueto`

**Deploy:**  
`https://bibliotecajogos-MatheusChiqueto.onrender.com`

**Dica:** nomeie o serviço como `bibliotecajogos-MatheusChiqueto` para seguir o formato solicitado.

---

## 📌 Entrega

* Enviar via **Moodle**:  
  1. Link do repositório público no GitHub  
  2. Link da aplicação no Render  

* **Prazo:** conforme data definida em sala.

---

👨‍💻 **Desenvolvedor:** Matheus Chiqueto  
🔗 **Exemplo de referência:**  
[Projeto Biblioteca de Jogos](https://ricardotecpro.github.io/ads_proj_aplicacao_full_stack/projetos/bibliotecajogos_01/)
