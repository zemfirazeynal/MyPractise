package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(5, 10, 21, 36, 27, 33);

        Integer integer = mutable_list.stream().filter(p -> p % 3 == 0 && p % 11 == 0).findFirst().get();
        System.out.println(integer);

    }
}
