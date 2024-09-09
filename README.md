## Resumo do Projeto Benchmark

O projeto **Benchmark** é uma aplicação Spring Boot que visa realizar testes de performance e benchmarking de uma função de cálculo. Ele utiliza JMH (Java Microbenchmark Harness) para medir o tempo de execução da função e a biblioteca Redis para armazenamento de dados em cache.

**Principais Módulos/Componentes:**

1. **BenchmarkTest:**  Classe de teste JMH que define o cenário de benchmark, executando a função "calcular" do módulo `CalculatorService`.
2. **CalculatorService:** Contém a função "calcular" que realiza uma operação de soma simples em um loop, simulando uma tarefa computacional. Possui uma tarefa agendada para realizar operações de escrita e leitura no Redis a cada 5 segundos.
3. **RedisService:** Serviço responsável pela interação com o Redis, oferecendo métodos para definir e recuperar valores.
4. **RedisConfig:** Classe de configuração do Redis, definindo o template para acesso ao banco de dados.
5. **CalculadoraController:** Controlador REST que disponibiliza um endpoint `/calcular` para executar a função "calcular" do `CalculatorService`.
6. **BenchmarkApplication:** Classe principal da aplicação Spring Boot, responsável por iniciar o servidor.

**Propósito Geral e Funcionalidades:**

O projeto tem como objetivo principal:

* **Benchmarking:** Analisar o desempenho da função `calcular` através de testes JMH.
* **Integração com Redis:**  Utiliza o Redis como um sistema de cache para armazenar dados e observar o impacto na performance da aplicação.
* **Teste de Carga:**  A tarefa agendada no `CalculatorService` simula uma carga constante sobre o Redis e a função `calcular`, permitindo avaliar o desempenho da aplicação sob stress.

As funcionalidades principais incluem:

* **Executar testes JMH:** O módulo `BenchmarkTest` permite realizar testes de performance da função `calcular` através do JMH.
* **Interação com Redis:**  O `RedisService` possibilita a integração com o Redis para armazenar e recuperar dados.
* **Tarefa Agendada:** O `CalculatorService` executa uma tarefa programada que realiza operações de escrita e leitura no Redis, simulando um cenário de uso real.
* **Exposição de API REST:** O `CalculadoraController` expõe um endpoint REST para realizar cálculos com a função `calcular`.

Em resumo, o projeto Benchmark é uma aplicação de demonstração que permite analisar o desempenho de uma função de cálculo utilizando JMH e a integração com o Redis, simulando um cenário de carga e otimização de performance.