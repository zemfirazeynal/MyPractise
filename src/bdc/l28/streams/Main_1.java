package bdc.l28.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main_1 {
    public static void main(String[] args) {
        List<Integer > mutable_list = Arrays.asList(5, 10, 21, 36, 27, 33);

        List<Integer> dividedByThree = null;
        for (int i = 0; i<mutable_list.size(); i++){
            if (mutable_list.get(i)%3==0){
                if (Objects.isNull(dividedByThree)){
                    dividedByThree = new ArrayList<>();
                }
                dividedByThree.add(mutable_list.get(i));
            }
            //System.out.println(mutable_list.get(i));
        }

        if (Objects.nonNull(dividedByThree) && dividedByThree.size()>0){
            for (int j = 0; j<dividedByThree.size(); j++){
                System.out.println(dividedByThree.get(j));
            }
        }
    }
}
