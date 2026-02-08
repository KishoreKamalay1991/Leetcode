
public class GasStations {

public static int canCompleteCircuit(int[] gas, int[] cost) {

   int totalgain = 0;
   int currentgain =0;
   int ans = 0;
   
   for(int i = 0; i < gas.length; i++) {
	   int gain =  gas[i] - cost[i];
	   totalgain = totalgain + gain;
	   currentgain = currentgain + gain;
	   if(currentgain < 0 ) {
		   ans = i + 1;
		   currentgain = 0;
	   }
	   
   }
   return totalgain >=0 ? ans : -1;
}
  public static void main(String[] args) {
	 
	 int[] gas  = {1, 2, 3, 4, 5};
	 int[] cost = {3, 4, 5, 1, 2};

	 
	 int result = canCompleteCircuit(gas, cost);
	 
  
  }
}
