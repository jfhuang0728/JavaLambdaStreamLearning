package lambda表达式;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * 使用lambda表达式必须要有对应的函数接口
 * 函数接口：只有一个抽象方法的接口
 *
 */
public class WriteLambdaInDifferentWays {
    public static void main(String[] args) {
        //1, 不带参的lambda表达式
        Runnable runnable = ()-> System.out.println("不带参的lambda表达式");
        //2, 带参的lambda表达式
        Comparator<String> comparator = (o1, o2) -> -o1.length() + o2.length();
        ActionListener listener = event -> System.out.println("带一个参数的lambda表达式");
        //3, 类型推断机制
        //binaryOperator是一段代码，而不是l1 - l2的结果
        BinaryOperator<Long> binaryOperator = (Long l1, Long l2) -> l1 - l2;
        System.out.println(binaryOperator.apply(1l, 2l));
        BinaryOperator<Long> longBinaryOperator = (l1, l2) -> l1 + l2;
    }
}
