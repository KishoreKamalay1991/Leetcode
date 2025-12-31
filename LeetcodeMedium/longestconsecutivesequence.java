import java.util.HashSet;

public class longestconsecutivesequence {

    public static int longestsequence(int[] nums) {

        if(nums.length == 0) {
            return 0;
        }

        HashSet<Integer> longset = new HashSet<>();

        for(int num : nums) {
            longset.add(num);
        }

        int longestChain = 0;

        for(int num : longset) {

            if(!longset.contains(num - 1)) {

                int currentNum = num;
                int currentChain = 1;

                while(longset.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentChain += 1;
                }
                longestChain = Math.max(longestChain, currentChain);
            }
        }

        return longestChain;

    }


    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};

        int longestsequence = longestsequence(nums);

        System.out.println(longestsequence);

    }


}
