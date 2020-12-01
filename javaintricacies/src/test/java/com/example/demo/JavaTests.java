package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@Warmup(iterations = 5, batchSize = 1) 		// Warmup Iteration = 3
@Measurement(time = 10, iterations = 1, batchSize = 1, timeUnit = TimeUnit.SECONDS)
@Fork( value = 5, jvmArgs = {"-Xms100M", "-Xmx200M"})

public class JavaTests {

    public void testThis()
    {
        Integer.parseInt("100_000");
    }

    @Benchmark
    public void measureName() {

        for (int i=0;i<2;i++)
            System.out.println("Hello"+i+i);
    }

    @Benchmark
    @BenchmarkMode(Mode.All)  @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void foo()
    {
        for (int i=0;i<2;i++)
            System.out.println("Hello"+i);
    }

}
