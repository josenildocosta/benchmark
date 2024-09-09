## Resumo do Projeto "Benchmark"

**1. Propósito Geral do Projeto:**

O projeto "Benchmark" visa realizar testes de performance de um serviço de cálculo, chamado "CalculatorService", utilizando a ferramenta JMH (Java Microbenchmark Harness) e um banco de dados Redis para armazenamento de dados. 

**2. Principais Módulos/Componentes:**

* **BenchmarkApplication:** Classe principal da aplicação Spring Boot, responsável por iniciar a aplicação.
* **BenchmarkTest:** Classe que define e executa os testes de benchmark utilizando a biblioteca JMH. A classe contém um método `benchmarkTest` que chama o serviço `CalculatorService` para executar o cálculo.
* **CalculatorService:** Serviço responsável por realizar o cálculo, com um método `calcular` que itera por um intervalo definido e um método `scheduleTaskUsingCronExpression` que atualiza os valores no Redis a cada 5 segundos.
* **RedisService:** Serviço responsável por interagir com o Redis, com métodos para inserir e recuperar valores.
* **CalculadoraController:** Controlador REST que expõe a operação de cálculo através de uma rota `/calcular`.
* **RedisConfig:** Configuração do Spring para o Redis, definindo a `RedisTemplate` para comunicação com o banco de dados.

**3. Funcionalidades Principais:**

* **Testes de Performance (Benchmark):** O projeto utiliza JMH para medir o desempenho do serviço `CalculatorService`, analisando o tempo de execução do cálculo e a influência do Redis.
* **Serviço de Cálculo:** O serviço `CalculatorService` executa um cálculo simples, iterando por um intervalo definido, e pode ser chamado através de uma API REST.
* **Integração com Redis:** A aplicação utiliza Redis como um sistema de armazenamento de dados, permitindo a atualização periódica dos valores armazenados.

**Resumo Conciso:**

O projeto "Benchmark" é uma aplicação Spring Boot que realiza testes de performance de um serviço de cálculo, utilizando JMH e Redis. A aplicação contém um controlador REST para acesso ao serviço e uma configuração do Spring para Redis. O projeto permite a avaliação da performance do serviço em diferentes cenários e a análise da influência do Redis.