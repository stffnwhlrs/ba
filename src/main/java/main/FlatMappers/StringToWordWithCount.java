package main.FlatMappers;

import main.POJOs.WordWithCount;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

public class StringToWordWithCount implements FlatMapFunction<String, WordWithCount> {
    @Override
    public void flatMap(String value, Collector<WordWithCount> out) {
        for (String word : value.split("\\s")) {
            out.collect(new WordWithCount(word, 1L));
        }
    }
}