import java.util.Arrays;

public class squaresofSortedArray {

    public  static int[] squaresofsortedarray(int[] arr) {

        int[] res = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         res[i] = arr[i] * arr[i];
      }

      Arrays.sort(res);

      return res;

    }

    public static void main() {

        int[] nums = {-4, -1, 0, 2, 6, 10};

        int[] result = squaresofsortedarray(nums);


    }

}
