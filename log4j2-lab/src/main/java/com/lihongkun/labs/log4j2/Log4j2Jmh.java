package com.lihongkun.labs.log4j2;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Benchmark)
public class Log4j2Jmh {
    private static final Logger LOGGER = LoggerFactory.getLogger(Log4j2Jmh.class);

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(Log4j2Jmh.class.getSimpleName())
                .forks(1)
                .warmupIterations(1)logba
                .measurementIterations(5)
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    @Threads(2)
    public void async(){
        LOGGER.info("hello world");
    }
}
