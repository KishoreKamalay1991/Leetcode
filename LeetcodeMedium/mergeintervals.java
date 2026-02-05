import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeintervals {

    public static int[][] mergeIntervals(int[][] intervals) {

        int n = intervals.length;
        if(intervals.length <= 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> result = new ArrayList<>();
        int[] first = intervals[0];
        result.add(first);
        

        for(int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            
            if(next[0] <= first[i]) {
             first[1] = Math.max(first[1], next[1]);
            } else {
                first = next;
                result.add(first);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

       int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};

       int[][] result = mergeIntervals(intervals);

    }

}
