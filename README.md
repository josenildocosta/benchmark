## Resumo do Projeto Java

O projeto **Benchmark** é uma aplicação Spring Boot que tem como objetivo realizar testes de benchmark de performance para um serviço de cálculo, utilizando a biblioteca JMH (Java Microbenchmark Harness) e o banco de dados Redis para armazenamento de dados. 

### Principais Módulos/Componentes:

* **BenchmarkApplication:** Classe principal da aplicação Spring Boot, responsável por iniciar o servidor e configurar a aplicação.
* **BenchmarkTest:** Classe de teste JMH que executa o benchmark do serviço de cálculo, utilizando o método `calcular` da classe `CalculatorService`.
* **CalculatorService:** Serviço responsável por realizar o cálculo, utilizando um loop iterativo para simular a execução de um processo longo. Também inclui um método agendado (`scheduleTaskUsingCronExpression`) para atualizar dados no Redis periodicamente.
* **RedisService:** Serviço que abstrai as operações de acesso ao Redis, utilizando um `RedisTemplate` para realizar operações de leitura e escrita de dados.
* **RedisConfig:** Classe de configuração do Spring que configura o `RedisTemplate` para uso na aplicação.
* **CalculadoraController:** Controlador REST que expõe um endpoint `/calcular` para realizar o cálculo via requisição HTTP, utilizando o `CalculatorService`.


### Propósito Geral e Funcionalidades Principais:

O projeto tem como principal objetivo **medir a performance do serviço de cálculo** em diferentes cenários e **comparar os resultados** utilizando a biblioteca JMH. 

**Funcionalidades principais:**

* **Serviço de cálculo:** realiza cálculos simples, simulando um processo longo.
* **Agendamento de tarefas:** atualiza dados no Redis periodicamente.
* **Armazenamento de dados:** utiliza o Redis para armazenar e recuperar dados.
* **API REST:** expõe um endpoint para realizar cálculos via requisições HTTP.
* **Testes de performance:** utiliza JMH para medir a performance do serviço de cálculo.

Em resumo, o projeto **Benchmark** é uma aplicação completa que combina um serviço de cálculo, armazenamento de dados em Redis, agendamento de tarefas e testes de performance. Ele serve como um exemplo prático de como utilizar a biblioteca JMH para avaliar a performance de um serviço e como integrar o Redis para armazenar dados e realizar operações de cache.