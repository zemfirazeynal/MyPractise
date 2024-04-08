package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main_10 {
    public static void main(String[] args) {
        List<Integer> mutable_list = Arrays.asList(36, 5, 10, 6, 12, 21, 36, 27, 33);

        Stream<Integer> stream = mutable_list.stream();
        stream.filter(p -> p % 3 == 0 && p % 2 ==0)
                .limit(2)
                .forEach(System.out::println);

    }
}
