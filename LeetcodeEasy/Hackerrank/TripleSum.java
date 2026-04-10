package Hackerrank;

import java.util.*;

public class TripleSum {

   public static int tripleSumCount(List<Integer> A1, List<Integer> B1, List<Integer> C1) {
	   
	   List<Integer> A2 = new ArrayList<>(new HashSet<>(A1));
	   
	   List<Integer> B2 = new ArrayList<>(new ArrayList<>(B1));
	   
	   List<Integer> C2 = new ArrayList<>(new ArrayList<>(C1));
	   
	   Collections.sort(A2);
	   Collections.sort(B2);
	   Collections.sort(C2);
	   
	   int count = 0;
	   
	   int i = 0;
	   int j = 0;
	   
	   for(int q : B2) {
		   
		   while(i < A2.size() && A2.get(i) <= q) {
			   i++;
		   }
		   
		   while(j < C2.size() && C2.get(j) <= q) {
			  j++;
		   }
		   
		   count =  count + (i * j);
		  
	   }
	   
	   
	   return count;
	   
	   
   }

   public static void main(String[] args) {
	   
	   Integer[] A = {1, 3, 5};
	   
	   Integer[] B = {2, 3};
	   
	   Integer[] C = {1, 2, 3};
	   
	   List<Integer> A1 = Arrays.asList(A);
	   List<Integer> B1 = Arrays.asList(B);
	   List<Integer> C1 = Arrays.asList(C);
	   
	   
	   
	   
	   int result = tripleSumCount(A1, B1, C1);
	   
	   System.out.println("result " + result);
	  
   }
}
