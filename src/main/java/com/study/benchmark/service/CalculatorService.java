package com.study.benchmark.service;

import org.springframework.stereotype.Service;

import static java.lang.Thread.sleep;

@Service
public class CalculatorService {
    public int calcular(int x, int y){
        int z = 0;
        
        for (int i = x; i < y; i++){
            z = i;
        }

//        try {
//            sleep(1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        return z;
    }
}
