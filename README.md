## Resumo do Projeto Benchmark

O projeto "Benchmark" é uma aplicação Spring Boot que serve como um framework para testes de desempenho de um serviço de cálculo. O projeto utiliza o JMH (Java Microbenchmark Harness) para realizar os testes e o Redis para armazenar e recuperar dados.

### Principais Módulos/Componentes:

* **BenchmarkApplication:** Classe principal da aplicação Spring Boot. Inicia a aplicação e configura a funcionalidade de agendamento.
* **BenchmarkTest:** Classe de teste do JMH, configurada para executar testes de desempenho do serviço de cálculo (CalculatorService).
* **CalculatorService:** Serviço responsável por executar a operação de cálculo e armazenar os resultados no Redis. Inclui uma tarefa agendada para atualizar dados no Redis.
* **RedisService:** Serviço que encapsula as operações com o Redis, como salvar e buscar dados.
* **RedisConfig:** Classe de configuração do Spring Boot para o Redis, incluindo o serializer para serialização/deserialização de dados.
* **CalculadoraController:** Controller REST que expõe a API para realizar a operação de cálculo.

### Propósito Geral e Funcionalidades Principais:

O objetivo principal do projeto é fornecer um framework para:

* **Benchmarking:** Realizar testes de desempenho do serviço de cálculo com o JMH.
* **Armazenamento de Dados:** Utilizar o Redis para armazenar e recuperar dados durante os testes e operações do serviço.
* **Integração REST:** Expor a API para que outros sistemas possam utilizar o serviço de cálculo.

As funcionalidades principais do projeto incluem:

* **Serviço de Cálculo:** Calcular o valor de uma variável dentro de um intervalo definido.
* **Tarefa Agendada:** Atualizar dados no Redis periodicamente.
* **Operações Redis:** Salvar e recuperar dados no Redis.
* **API REST:** Executar o cálculo através de uma requisição HTTP GET.

O projeto é um bom exemplo de como utilizar o Spring Boot e o JMH para criar testes de desempenho e integrar a aplicação com o Redis. Além disso, a implementação da API REST permite a integração com outras aplicações.