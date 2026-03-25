import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {

  public static int meetingrooms(int[][] meetingrooms) {
	 
	 
	  Arrays.sort(meetingrooms, (a, b) -> Integer.compare(a[0], b[0]));
	  
	  System.out.println(Arrays.deepToString(meetingrooms));
	  
	  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	  
	  minHeap.add(meetingrooms[0][1]);
	  
	  for(int i = 1; i < meetingrooms.length; i++) {
		 int start = meetingrooms[i][0];
		 int end = meetingrooms[i][1];
		 
		 if(start >= minHeap.peek()) {
			minHeap.poll();
		 }
		 minHeap.add(end);
	  }
	  
	  
	  
	  
	  
	  
	  return minHeap.size();
	 
  }

  public static void main(String[] args) {
	 
	 int[][] intervals = {{0,30},{15,20},{5,10}};
	 
	 int result = meetingrooms(intervals);
	 
	 System.out.println("result " + result);
	 
  }
}
