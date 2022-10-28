package me.tonabarrera.ejemplos;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" +text+"\"";
        System.out.println(quote.apply("uwu"));

        BiFunction<String, Integer, String> leftPath = (text, number) -> String.format("%" + number + "s", text);
        BinaryOperator<Integer> mul = (x, y) -> x*y;
        System.out.println(leftPath.apply("uwu", 32));

        StringOperation operation = () -> 10;
        operation.operate("moy");
        DoOperation dos = System.out::println;
        dos.execute(3, "gaga");
        dos.take("take");
    }

    @FunctionalInterface
    interface StringOperation {
        int getAmount();
        default void operate(String text){
            int x = getAmount();
            while (x-- > 0) {
                System.out.println(text);
            }
        }
    }
    @FunctionalInterface
    interface DoOperation {
        void take(String text);

        default void execute(int x, String text) {
            while (x-- > 0) {
                take(text);
            }
        }
    }
}
