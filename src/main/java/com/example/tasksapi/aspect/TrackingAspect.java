package com.example.tasksapi.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

import java.io.FileWriter;
import java.util.Arrays;

@Component
@Aspect
public class TrackingAspect {
    public static final String
            LOG_PATH = "src/main/java/com/example/tasksapi/log/log.txt";

    @Before("execution(* com.example.tasksapi.service.*.*(..))")
    public void loggingService(JoinPoint joinPoint) throws Throwable {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write("Launch a service: " +
                    joinPoint.getSignature().getName() +
                    " with arguments: " +
                    Arrays.stream(joinPoint.getArgs()).toList());
            writer.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
