import java.util.PriorityQueue;

public class klargestelementinArray {

    public static int Klargest(int[] arr, int k) {


        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0 ; i < arr.length ; i++) {
            pq.offer(arr[i]);
        }

        while(pq.size() > k) {

           pq.poll();

        }

        return pq.peek();
    }

    public static void main(String[] args) {


        int[] nums = {3,2,1,5,6,4};
        int k = 2;


        int result = Klargest(nums, k);


    }



}
