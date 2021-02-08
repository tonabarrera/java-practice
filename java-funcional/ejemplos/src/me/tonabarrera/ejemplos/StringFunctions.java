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
    }
}
