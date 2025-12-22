public class search2dmatrix {

    public static boolean searchmatrix(int[][] nums , int target) {

        int row = nums.length;
        int col = nums[0].length;


        int left = 0;
        int right = row * col - 1;


        while(left <= right) {
            int mid = left + (right - left) / 2;
            int rowx = mid / col;
            int colx = mid % col;

            int search = nums[rowx][colx];

            if(search == target ) {
                return true;
            } else if(search < target)  {
                left = mid + 1;
            } else {
                right = mid - 1;
            }


        }

        return false;

    }

    public static void main(String[] args) {

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;

        Boolean result = searchmatrix(matrix, target);



    }

}
