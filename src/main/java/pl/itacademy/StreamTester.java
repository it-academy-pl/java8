package pl.itacademy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTester {

    static List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10);


    static List<String> strings = Arrays.asList(
            "one", "two", "three", "four", "five", "six");

    public static void main(String[] args) {

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        Stream<Integer> numbersStream = numbers.stream();

        System.out.println(numbersStream
                .max(Comparator.comparingInt(i -> i))
                .orElse(0));

        numbers.stream()
                .distinct()
                .filter(i -> i >= 7)
                .forEach(System.out::println);


        System.out.println("String steam:");
        strings.stream()
                .peek(System.out::println)
                .map(s -> s.toUpperCase()) //stream<String>
                .peek(System.out::println)
                .map(s -> s.length()) //stream<Integer>
                .forEach(System.out::println);



    }

}
