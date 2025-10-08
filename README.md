# 📚 Biblioteca de Jogos Pessoais (Spring Boot)

Aplicação Web Full Stack (Spring Boot + Thymeleaf + Spring Data JPA).
Dev: **Matheus Chiqueto**.

## Local (H2)
```bash
mvn spring-boot:run
# http://localhost:8080
```

## Prod (Render + Neon)
Build:
```bash
mvn -DskipTests package
java -jar target/*.jar
```

Variables (prod):
```
SPRING_PROFILES_ACTIVE=prod
SPRING_DATASOURCE_URL=jdbc:postgresql://<host>:<port>/<db>
SPRING_DATASOURCE_USERNAME=<user>
SPRING_DATASOURCE_PASSWORD=<pass>
```

**Deploy:** `https://bibliotecajogos-MatheusChiqueto.onrender.com`  
**Dica:** nomeie o serviço como `bibliotecajogos-MatheusChiqueto`.
