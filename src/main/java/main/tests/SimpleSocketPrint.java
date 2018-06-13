package main.tests;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class SimpleSocketPrint {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<String> dataStream = env.socketTextStream("localhost", 9999);

        dataStream.print();

        env.execute("Simple Socket Print");
    }
}
