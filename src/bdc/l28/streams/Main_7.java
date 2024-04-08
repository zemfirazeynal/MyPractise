package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;

public class Main_7 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(6, 36, 5, 10, 6, 12, 21, 36, 27, 33);

        Integer integer = mutable_list.stream().filter(p -> p % 3 == 0 && p % 2 == 0)
                .peek(p -> System.out.println(p))
                .filter(p -> p % 4 == 0)
                .findAny().get();
        System.out.println(integer);


    }
}
