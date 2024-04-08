package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main_15 {
    public static void main(String[] args) {
        List<Integer> mutable_list = Arrays.asList(36, 5, 10, 6, 12, 21, 36, 27, 33);

        Stream<Integer> stream = mutable_list.stream();

        boolean anymatch = mutable_list.stream().anyMatch(p -> p % 2 == 0 && p % 3 == 0);
        System.out.println("anymatch:"+anymatch);
        boolean allmatch = mutable_list.stream().allMatch(p -> p % 2 == 0 && p % 3 == 0);
        System.out.println("allmatch:"+allmatch);


        Integer min = mutable_list.stream().filter(p -> p % 2 == 0 && p % 3 == 0)
                .min(Integer::compareTo).get();
        System.out.println("min:"+min);


        Integer max = mutable_list.stream().filter(p -> p % 2 == 0 && p % 3 == 0)
                .max(Integer::compareTo).get();

        System.out.println("max:"+max);



    }
}
