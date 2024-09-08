## Resumo do Projeto Java

Este projeto Java é um sistema de **benchmarking e cálculo**, que utiliza **Spring Boot** para a infraestrutura e **Redis** para armazenamento de dados. O objetivo principal é avaliar o desempenho de um serviço de cálculo, utilizando a biblioteca **JMH** (Java Microbenchmark Harness).

**Principais Módulos/Componentes:**

* **BenchmarkApplication:** Classe principal da aplicação Spring Boot, responsável por iniciar a aplicação.
* **BenchmarkTest:** Classe JMH para realizar os benchmarks do serviço de cálculo.
* **CalculatorService:** Serviço responsável por executar o cálculo propriamente dito.
* **CalculatorController:** Controlador REST para expor a operação de cálculo via API.
* **RedisService:** Serviço para interação com o banco de dados Redis.
* **RedisConfig:** Classe de configuração para o RedisTemplate, responsável por serializar os dados.

**Funcionalidades Principais:**

* **Serviço de Cálculo:** Realiza uma operação de cálculo simples em um loop, que pode ser configurado para executar por um determinado tempo.
* **Benchmarking:** A classe BenchmarkTest utiliza a biblioteca JMH para medir o desempenho do serviço de cálculo, utilizando diferentes parâmetros como tempo de execução e número de iterações.
* **Armazenamento em Redis:** O serviço de cálculo armazena dados em Redis utilizando o serviço RedisService e a configuração RedisConfig, para fins de teste e análise.
* **API REST:** O controlador CalculatorController expõe a operação de cálculo via API, permitindo que outros sistemas acessem e testem o serviço.
* **Tarefa Agendada:** O serviço CalculatorService possui uma tarefa agendada para atualizar dados em Redis periodicamente, demonstrando a interação com o banco de dados.

**Objetivo Geral:**

O objetivo geral do projeto é criar um sistema para avaliar o desempenho de um serviço de cálculo, utilizando ferramentas de benchmarking, armazenamento em memória e uma API REST para acesso externo. O sistema é projetado para permitir testes de carga e análise do desempenho, proporcionando insights sobre a eficiência do serviço de cálculo.