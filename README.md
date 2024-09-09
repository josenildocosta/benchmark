## Resumo do Projeto Benchmark

Este projeto Java é uma aplicação Spring Boot que visa realizar benchmarks e testes de performance. O projeto possui os seguintes módulos principais:

**1. Módulo de Cálculo:**
* Contém o serviço `CalculatorService`, responsável por realizar uma operação de cálculo simples.
* A operação simula um loop de iteração, similar a um processamento de dados.
* Possui um método `scheduleTaskUsingCronExpression` que executa uma tarefa agendada a cada 5 segundos, manipulando dados no Redis.

**2. Módulo de Benchmark:**
* Utiliza a biblioteca JMH (Java Microbenchmark Harness) para medir a performance do método `calcular` do `CalculatorService`.
* Realiza testes de performance em diferentes modos e exibe os resultados em milissegundos.

**3. Módulo de Redis:**
* Utiliza Spring Data Redis para interagir com um banco de dados Redis.
* O serviço `RedisService` fornece métodos para armazenar e recuperar dados no Redis.
* É usado pela tarefa agendada do `CalculatorService` para manipular dados no Redis.

**4. Módulo de Controlador Web:**
* Fornece uma API REST para chamar o serviço `CalculatorService` e realizar cálculos.
* O endpoint `/calcular` recebe dois parâmetros inteiros (x e y) e retorna o resultado da operação de cálculo.

**Objetivo Geral:**

O projeto visa demonstrar como realizar testes de performance em código Java utilizando JMH. Além disso, demonstra o uso do Spring Boot, Redis e APIs REST para construir uma aplicação completa.

**Funcionalidades Principais:**

* **Cálculo simples:** Realiza uma operação de cálculo simples em um loop de iteração.
* **Benchmark:** Mede a performance da operação de cálculo utilizando JMH.
* **Interação com Redis:** Armazena e recupera dados em um banco de dados Redis.
* **API REST:** Fornece um endpoint REST para realizar cálculos.
* **Tarefa agendada:** Executa uma tarefa a cada 5 segundos para manipular dados no Redis.

**Observações:**

* O projeto demonstra como implementar um benchmark de forma simples, mas pode ser expandido para testes mais complexos.
* O serviço de cálculo é um exemplo simples e pode ser substituído por qualquer outra operação que precise ser analisada.
* O código apresenta um exemplo de tarefa agendada, que pode ser modificada para realizar outras operações periódicas.