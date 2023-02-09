package lambdastream;

import java.lang.reflect.Array;
import java.util.*;

public class StreamPrac {
    public static void run() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};

        // without stream
//        ArrayList<Integer> al = new ArrayList<>();
//        for (int i = 0; i < a.length; i++) {  // extract only even numbers
//            if (a[i] % 2 == 0) {
//                al.add(a[i]);
//            }
//        }
//
//        HashSet<Integer> s = new HashSet<>(al);  // remove duplicates
//
//        al = new ArrayList<>(s);  // convert to list
//
//        al.sort(Comparator.reverseOrder());  // reverse sort
//
//        int[] res = new int[al.size()];  // result as array
//        for (int i =0; i < res.length; i++){
//            res[i] = al.get(i);
//        }

        // with stream
        int[] res = Arrays.stream(a)
                .boxed()  // to use reversesort, it converts the type intstream to Inteagerstream
                .filter((x) -> x % 2 == 0)  // only even numbers
                .distinct()  // remove duplicates
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)  // convert integer to int because, we will finally make int[]
                .toArray();  // convert to an array

    }
}
