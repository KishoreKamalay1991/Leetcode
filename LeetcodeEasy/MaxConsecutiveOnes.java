public class MaxConsecutiveOnes {


    public static int maxconsecutive(int[] arr) {
        int j = 0;
        int max = 0;
        for (int i = 0 ; i < arr.length; i++) {
             if(arr[i] == 1) {
                 j = j + 1 ;
                 max = Math.max(max, j);
             }
              else  {
               j = 0;
             }

        }

        return max;
    }

    public static void main(String[] args) {

        int nums[] = {1,1,0,1,1,1};

        int res = maxconsecutive(nums);

        System.out.println(res);


    }
}
