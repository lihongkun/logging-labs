package com.lihongkun.labs.logback;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@State(Scope.Benchmark)
public class LogbackJmh {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogbackJmh.class);

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(LogbackJmh.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)
                .measurementIterations(5)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    @Threads(32)
    public void async(){
        LOGGER.info("hello world");
    }
}
