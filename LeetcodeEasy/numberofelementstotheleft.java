public class numberofelementstotheleft {

    public static int leftelements(int[] arr, int tar) {

        int left = 0;
        int right = arr.length;

        while(left < right) {

            int mid = left + (right - left) /2 ;

            if (arr[mid] < tar ) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }

        return left;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        int tar = 7;

        int numberofele = leftelements(nums, tar);

        System.out.println("numbe rof elements" + numberofele);



    }

}
