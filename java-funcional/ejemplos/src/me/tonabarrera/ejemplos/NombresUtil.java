package me.tonabarrera.ejemplos;

import java.util.Arrays;
import java.util.List;

public class NombresUtil {
    public static void main(String[] args) {
        List<String> nombres = getList("no", "se");
        nombres.forEach(System.out::println);
    }

    static <T> List<T> getList(T ... elements) {
        return Arrays.asList(elements);
    }
}
