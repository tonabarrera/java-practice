package me.tonabarrera.ejemplos;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        System.out.println("uwu");
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(square.apply(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(8));
        Predicate<Student> isApproved = student -> student.calificacion > 5;
        System.out.println(isApproved.test(new Student(6)));
    }

    public static class Student {
        private Integer calificacion;

        public Integer getCalificacion() {
            return calificacion;
        }

        public Student(Integer calificacion) {
            this.calificacion = calificacion;
        }
    }
}
