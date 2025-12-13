package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<String> strs = Arrays.asList("kamal", "kish", "hellok" , "qa");



        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        evenList = list.stream().filter(s1 -> s1 % 2 == 0).collect(Collectors.toList());
        oddList = list.stream().filter(s1 -> s1 % 2 == 1).collect(Collectors.toList());

        int secondHighest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        // Sort strings by length

        List<String> sorted = strs.stream().sorted( (a , b) -> a.length() - b.length()).collect(Collectors.toList());

        System.out.println(sorted);






        System.out.println(evenList);
        System.out.println(oddList);
        System.out.println(secondHighest);
    }

}
