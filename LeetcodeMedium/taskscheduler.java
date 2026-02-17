import java.util.Arrays;

public class taskscheduler {
  
  public static int tashSch(char[] tasks, int n) {
    
    int[] frequency = new int[26];
    
    int maxValue = 0;
    
    int countsec = 0;
    
    for(char ch : tasks) {
       frequency[ch - 'A']++;
    }
    
    for(int num : frequency) {
      maxValue = Math.max(maxValue, num);
    }
    
    for(int num1 : frequency) {
      if(num1 == maxValue) {
        countsec++;
      }
    }
    
    
    
    System.out.println(Arrays.toString(frequency));
    
    int len =  ((n + 1) * (maxValue - 1)) + countsec;
    
    return Math.max(len, tasks.length);
  }

  public static void main(String[] args) {
    
    char[] tasks = {'A','A','A','B','B','B'};
    int n = 2;
  
     int result = tashSch(tasks, n);
     
     System.out.println("result " + result);
  }
}
