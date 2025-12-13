package Thingstocheck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sorting {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 7, 1, 9);
        Collections.sort(numbers, (a,b) -> {
            return b - a;
        });
        System.out.println(numbers);




    }

}
