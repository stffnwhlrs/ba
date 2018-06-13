package main.tests;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;

public class SimpleArrayPrint {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<String> dataStream = env.fromCollection(Arrays.asList("Hallo", "Du", "schöne", "Welt!"));

        dataStream.print();

        env.execute("Simple Array Print");
    }
}
