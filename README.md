# Arquitetura de Microsserviços

A organização do projeto utiliza soluções Spring Cloud (Zuul e Eureka) para disponibilizar serviços REST com redundância dos dois serviços: passaporte-ws e seguranca-ws. Cada serviço possui o recurso ```whoami``` para descobrir em que porta o serviço responde.

Para rodar o projeto, entre nos diretórios eureka, gateway, passaporte-ws e seguranca-ws, nessa ordem, e rode o comando ```mvnw spring-boot:run``` em cada um deles. Depois dos 4 projetos estarem em execução, será possível acessar http://localhost:8888/passaporte-ws/whoami e http://localhost:8888/seguranca-ws/whoami.
