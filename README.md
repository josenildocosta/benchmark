## Resumo do Projeto Java

O projeto **Benchmark** é uma aplicação Spring Boot que realiza benchmarks em um serviço de cálculo e utiliza Redis para armazenar dados. 

**Principais módulos/componentes:**

* **BenchmarkTest:** Classe responsável por executar os benchmarks utilizando a biblioteca JMH (Java Microbenchmark Harness). 
* **CalculatorService:** Serviço que realiza um cálculo simples (iterando entre dois números) e inclui uma tarefa agendada para manipular dados no Redis.
* **RedisService:** Serviço que encapsula as operações do Redis, como setar e recuperar valores.
* **RedisConfig:** Configuração do RedisTemplate para utilizar o Redis.
* **CalculadoraController:** Controller que expõe uma API REST para realizar o cálculo.

**Propósito geral e funcionalidades principais:**

* **Benchmarking:** O projeto visa medir o desempenho do serviço `CalculatorService` utilizando o JMH, analisando a performance do cálculo e a interação com o Redis.
* **Armazenamento de dados:** O projeto usa o Redis como sistema de armazenamento de dados, com o `RedisService` encapsulando as operações com Redis.
* **Tarefa agendada:** O `CalculatorService` possui uma tarefa agendada que manipula dados no Redis a cada 5 segundos. 
* **API REST:** O projeto oferece uma API REST para realizar o cálculo através do `CalculadoraController`.

**Objetivo do projeto:**

O objetivo do projeto é demonstrar como utilizar o JMH para realizar benchmarks em um serviço Spring Boot, incluindo a interação com o Redis e a implementação de tarefas agendadas. O projeto também demonstra como criar uma API REST para expor funcionalidades do serviço.