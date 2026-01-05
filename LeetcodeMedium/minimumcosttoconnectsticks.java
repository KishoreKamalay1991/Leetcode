import java.util.PriorityQueue;

public class minimumcosttoconnectsticks {

    public static int mincost(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }

        int result = 0;

        while(pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            result += first + second;
            pq.add(result);

        }

        return result;

    }
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 6};

       int mincost=  mincost(arr);

    }

}
