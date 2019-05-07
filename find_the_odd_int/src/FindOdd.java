//Given an array, find the int that appears an odd number of times.
//There will always be only one integer that appears an odd number of times

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        List<Integer> list = Arrays.stream(a).sorted().boxed().collect(Collectors.toList());

        for(int i : list ) {
            int start = list.indexOf(i);
            int end = list.lastIndexOf(i)+1;
            if((end-start)%2!=0) {
                return i;
            }
        }
        return 0;
    }
}