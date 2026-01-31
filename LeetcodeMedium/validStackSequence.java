import java.util.Stack;

public class validStackSequence {
  
  public static Boolean isValidSequence(int[] pushed, int[] popped) {
	  
	  Stack<Integer> Stk = new Stack();
	  int j = 0;
	  for(int i = 0; i < pushed.length; i++) {
		 Stk.push(pushed[i]);
		 System.out.println(Stk.peek());
		 System.out.println(popped[j]);
		 while(!Stk.isEmpty() && j < popped.length && Stk.peek() == popped[j]) {
			Stk.pop();
			j++;
		 }
	  }
	  System.out.println("j value " + j);
	  System.out.println(popped.length);
	  if(j == popped.length) {
		  return true;
	  }
	  
	 return false;
  }
   public static void main(String[] args) {
	  
	   int[] pushed = {1,2,3,4,5};
	   int[] popped = {4,5,3,2,1};
	   
	   Boolean isValidSequence = isValidSequence(pushed, popped);
	   System.out.println("is Valid sequence " + isValidSequence);
	  
   }
}
