package Thingstocheck;

public class twopointers {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};

        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            System.out.print(arr[start] + " ");
            start++;
            end--;
        }


    }

}
