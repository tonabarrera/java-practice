package me.tonabarrera.ejemplos;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import java.util.function.IntFunction;

public class AgeUtils {
    public static void main(String[] args) {
        IntFunction<String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);
        TriFunction<Integer, Integer, Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) + "-" + addCeros.apply(day));
        TriFunction<Integer, Integer, Integer, Integer> calculate =
                (x, y, z) -> Period.between(parseDate.apply(x, y, z), LocalDate.now()).getYears();
        System.out.println(calculate.apply(7, 7, 2007));
    }

    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
