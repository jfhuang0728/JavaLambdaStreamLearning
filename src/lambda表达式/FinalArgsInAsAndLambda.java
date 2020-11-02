package lambda表达式;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinalArgsInAsAndLambda {
    public static void main(String[] args) {
        //1, java 8中匿名内部类可以引用外部非final的变量
        final String name = "Apple";
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e + name);
            }
        };
        //2, lambda表达式
        String finalName = "Banana";
        //要在lambda表达式中使用的变量需要为final，即不能重复赋值
        //如：finalName = "Pear";
        ActionListener actionListener = event -> System.out.println(finalName);
    }
}
