public class ArmStringNumber {

 public static Boolean isArmStringNumber(int num) {
	 
	 int digitlen = String.valueOf(num).length();
	 
	 int sum = 0;
	 
	 int orgnum = num;
	 
	 while(num > 0) {
		 int n = num % 10;
		 sum += Math.pow(n, digitlen);
		 num = num / 10;
	 }
	 
	return sum == orgnum;
 }
public static void main(String[] args) {
	 
	 int num = 153;

	Boolean isArmStringNumber = isArmStringNumber(num);
	
	System.out.println("isArmStringNumber" + isArmStringNumber);

}

}
