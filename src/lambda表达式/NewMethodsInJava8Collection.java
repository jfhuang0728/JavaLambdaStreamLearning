package lambda表达式;

import java.util.*;
import java.util.function.Predicate;

public class NewMethodsInJava8Collection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList(Arrays.asList(new String[]{"Apple", "Banana", "Orange", "Pear"}));
//        list.forEach(element-> System.out.println(element));
//        list.removeIf(element -> element.length() < 6);
//        System.out.println(list);
//        list.replaceAll(element -> {
//            if(element.length() > 5){
//                return "Apple";
//            }
//            return element;
//        });
//        System.out.println(list);
//        Spliterator<String> spliterator1 = list.spliterator().trySplit();
//        Spliterator<String> spliterator2 = list.spliterator().trySplit();
//        spliterator1.forEachRemaining(ele -> System.out.println(ele));
//        spliterator2.forEachRemaining(ele -> System.out.println(ele));
        //Map中新增方法
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.merge(4, "first", (v1, v2) -> v1 + v2);
        System.out.println(map);
    }
}
