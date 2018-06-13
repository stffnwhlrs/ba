package main.tests;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class Boilerplate {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.execute();
    }



}
