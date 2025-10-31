public class peekelementmountainarray {

    public static int peekelement(int[] arr) {

        int peek = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > peek) {
                peek = arr[i];
            } else {
                return i - 1 ;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,3,2,1};

        int index = peekelement(arr);

        System.out.println(index);

    }

}
