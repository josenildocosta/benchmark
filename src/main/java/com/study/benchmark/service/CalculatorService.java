package com.study.benchmark.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

// import static java.lang.Thread.sleep;

@Service
public class CalculatorService {
    RedisService redisService;

    public CalculatorService(RedisService redisService ){
        this.redisService = redisService;
    }

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

    @Scheduled(cron = "5 * * * * *")
    public void scheduleTaskUsingCronExpression() {

        long now = System.currentTimeMillis() / 1000;
        System.out.println("schedule tasks using cron jobs - " + now);
        for(int i = 1; i < 100000; i++){
            redisService.setValue(redisService.getValue(String.valueOf(i)).toString(),i);
        };
    }

}
