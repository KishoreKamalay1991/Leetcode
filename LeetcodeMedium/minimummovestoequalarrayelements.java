public class minimummovestoequalarrayelements {

    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int moves = 0;

        for (int num : nums) {
            min = Math.min(min, num);
        }

        for (int num : nums) {
            moves += num - min;
        }

        return moves;
    }

    public static void main(String[] args) {

        int[] nums = {5,2,3};
        int result = minMoves(nums);
        System.out.println("result " + result);



    }

}
