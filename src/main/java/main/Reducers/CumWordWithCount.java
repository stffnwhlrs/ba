package main.Reducers;

import main.POJOs.WordWithCount;
import main.tests.SocketWindowWordCount;
import org.apache.flink.api.common.functions.ReduceFunction;

public class CumWordWithCount implements ReduceFunction<WordWithCount> {

    @Override
    public WordWithCount reduce(WordWithCount a, WordWithCount b) {
        return new WordWithCount(a.word, a.count + b.count);
    }
}
