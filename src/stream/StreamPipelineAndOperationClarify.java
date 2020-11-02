package stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipelineAndOperationClarify {
    public static void main(String[] args) {
        IntStream.range(1, 10)
                .peek(x -> System.out.print("\nA" + x))
                .limit(3)
                .peek(x -> System.out.print("B" + x))
                .forEach(x -> System.out.print("C" + x));
    }
}
