package Thingstocheck;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String [] args) {

        int [] arr = {1,2,3,4,1,2,3,4};

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            System.out.println(set.add(i));
        }

    }

}
