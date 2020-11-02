package lambda表达式;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ImportFunctionInterface {
    public static void main(String[] args) {
        //1, Predicate<T>: 判断一个数是否为偶数
        Predicate<Integer> predicate = num -> num % 2 == 0;
        System.out.println(predicate.test(4));
        //2, Consumer<T>: 输入一个数组，输出数组的第3个元素，如果数组元素个数小于3，直接返回null
        Consumer<List<Object>> consumer = list -> {
            if (list.size() < 3){
                System.out.println("null");
            }else {
                System.out.println(list.get(2));
            }
        };
        consumer.accept(Arrays.asList(new String[]{"Apple", "Banana", "Orange"}));
        //3, Function<T, R>: 计算一个数的平方，并返回
        Function<Integer, Integer> function = num -> num * num;
        System.out.println(function.apply(3));
        //4, Supplier<T>: 生产者
        
    }
}
