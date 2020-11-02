package stream;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Orange", "Pear");
        stream.parallel().forEach(
                event -> System.out.println(Thread.currentThread()));
        System.out.println(Runtime.getRuntime().availableProcessors());// 输出 8
        // parallelStream默认的并发线程数
        System.out.println(ForkJoinPool.getCommonPoolParallelism());// 输出 7
    }
}
