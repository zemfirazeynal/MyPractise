package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;

public class Main_4 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(5, 10, 21, 36, 27, 33);

        Integer integer = mutable_list.stream().filter(p -> {
            if (p % 3 == 0 && p % 11 == 0) {
                return true;
            }
            return false;
        }).findFirst().get();
        System.out.println(integer);

    }
}
