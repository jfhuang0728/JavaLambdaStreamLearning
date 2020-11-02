package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CommonlyUsedMethods {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of(new String[]{"Apple", "Banana", "Orange", "Pear"});
        //stream.forEach(element -> System.out.println(element));
        //stream.filter(ele -> ele.length() > 4).forEach(ele -> System.out.println(ele));
        //stream.map(ele -> ele.toUpperCase()).forEach(ele -> System.out.println(ele));
//        List<List<Integer>> list = new ArrayList<>();
//        list.add(Arrays.asList(new Integer[]{1, 2}));
//        list.add(Arrays.asList(new Integer[]{3, 4}));
//        list.stream().forEach(ele -> System.out.println(ele));
//        Stream.of(Arrays.asList(new String[]{"1", "2", "3"})).forEach(i -> System.out.println(i));
//        list.stream().flatMap(ele -> ele.stream()).forEach(ele -> System.out.println(ele));
    }
}
