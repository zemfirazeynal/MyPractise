package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;

public class Main_6 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(36, 5, 10, 6, 12, 21, 36, 27, 33);

        String valueOfString = mutable_list.stream().filter(p -> p % 3 == 0 && p % 2 == 0)
                .map(p -> {
                    if (p % 4 == 0) {
                        return String.valueOf(p);
                    } else {
                        return "hello";
                    }
                }).findAny().get();
        System.out.println(valueOfString);

    }
}
