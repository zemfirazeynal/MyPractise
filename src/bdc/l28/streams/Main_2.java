package bdc.l28.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main_2 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(5, 10, 21, 36, 27, 33);

        List<Integer> integerList = mutable_list.stream()
                .filter(p -> p % 3 == 0)
                .collect(Collectors.toList());

        if (Objects.nonNull(integerList) && integerList.size()>0){
            for (int j = 0; j<integerList.size(); j++){
                System.out.println(integerList.get(j));
            }

        }

    }
}
