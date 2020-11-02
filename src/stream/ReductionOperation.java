package stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReductionOperation {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Apple", "Banana", "Orange", "Pear");
//        Optional<String> reduce = stream.reduce((t1, t2) -> t1.length() >= t2.length() ? t1 : t2);
//        System.out.println(reduce.get());
//        String apple = stream.reduce("Apple", (t1, t2) -> t1.length() < t2.length() ? t1 : t2);
//        System.out.println(apple);
//        List<String> list = stream.collect(Collectors.toList()); // (1)
//        Set<String> set = stream.collect(Collectors.toSet()); // (2)
        //stream生成map的三种方式
        //1, 使用Collectors.toMap()
        //Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length));
       //2, 使用Collectors.partitioningBy()
        //System.out.println(stream.collect(Collectors.partitioningBy(ele -> ele.length() > 5)));
        //System.out.println(stream.collect(Collectors.groupingBy(ele -> ele.length())));
        //System.out.println(stream.collect(Collectors.groupingBy(ele -> ele.length(), Collectors.counting())));
        //System.out.println(stream.collect(Collectors.groupingBy(ele -> ele.charAt(0), Collectors.mapping(String::length, Collectors.toList()))));
        System.out.println(stream.collect(Collectors.joining(",", "{", "}")));
    }
}
