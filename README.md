# Arquitetura de Microsserviços

A organização do projeto utiliza Java 11 e soluções Spring Cloud (Zuul e Eureka) para disponibilizar serviços REST com redundância dos dois serviços: passaporte-ws e seguranca-ws. Cada serviço possui o recurso ```whoami``` para descobrir em que porta o serviço responde.

Para rodar o projeto, entre nos diretórios eureka, gateway, passaporte-ws e seguranca-ws, nessa ordem, e rode o comando ```mvnw spring-boot:run``` em cada um deles. Depois dos 4 projetos estarem em execução, será possível acessar http://localhost:8888/passaporte-ws/whoami e http://localhost:8888/seguranca-ws/whoami para obter a resposta com a porta do serviço que respondeu. Para ver o whoami de cada serviço respondendo com mais de uma porta, levante quantos serviços quiser de cada um. O registro no Eureka de todos os serviços e do gateway pode ser visualizado em http://localhost:8761.
