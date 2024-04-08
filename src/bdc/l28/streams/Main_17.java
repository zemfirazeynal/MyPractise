package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main_17 {
    public static void main(String[] args) {
        List<Integer> mutable_list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Stream<Integer> stream = mutable_list.stream();
        Integer reduce = stream.reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}
