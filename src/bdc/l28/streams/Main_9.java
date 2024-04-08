package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main_9 {
    public static void main(String[] args) {
        List<Integer> mutable_list = Arrays.asList(36, 5, 10, 6, 12, 21, 36, 27, 33);

        Stream<Integer> stream = mutable_list.stream();

        Integer integer = stream.filter(p -> p % 3 == 0 && p % 2 == 0)
                .peek(p -> {
                    System.out.println(p);
                    System.out.println("hello!");
                }).filter(p -> p % 4 == 0)
                        .findAny().get();

        System.out.println(integer);

    }
}
