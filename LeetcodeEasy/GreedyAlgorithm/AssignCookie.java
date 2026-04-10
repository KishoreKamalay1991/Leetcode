package GreedyAlgorithm;

import java.util.*;
public class AssignCookie {

  public static int assignCookies(int[] g, int[] s) {
	 
	  Arrays.sort(g);
	  Arrays.sort(s);
	  
	  int i = 0;
	  int j = 0;
	  int count = 0;
	  
	  while( i < g.length && j < s.length ) {
		  if(s[j] >= g[i]) {
			  i++;
			  j++;
			  count++;
		  } else {
			  j++;
		  }
	  }
	  
	  
	  return count;
	  
	 
	 
  }
  
   public static void main(String[] args) {
	   
	   int[] g = {1,2,3};
	   int[] s = {1,2};
	   
	   int result =  assignCookies(g, s);
	   
	   System.out.println("result " + result);
	   
	  
   }

}
