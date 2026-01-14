import java.util.Arrays;

public class mergeintervals {

    public static int[][] mergeIntervals(int[][] intervals) {

        int n = intervals.length;
        if(intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] mergedArray = new int[n][2];

        int[] current = intervals[0];



        int i = 1;

        while(i < intervals.length) {
            int[] next = intervals[i];
             if(current[1] >= next[0]) {

                current[1] = Math.max(current[1], next[0]);
             } else {

             }

        }

       return mergedArray;
    }

    public static void main(String[] args) {

       int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};

       int[][] result = mergeIntervals(intervals);

    }

}
