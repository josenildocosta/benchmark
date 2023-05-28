package com.study.benchmark;

import com.study.benchmark.service.CalculatorService;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.All)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class BenchmarkTest {
    CalculatorService calculatorService;

    public BenchmarkTest() {
        calculatorService = new CalculatorService();
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public void benchmarkTest() {
        calculatorService.calcular(1, 100000000);
    }
}
