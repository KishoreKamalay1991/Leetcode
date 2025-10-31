public class countandsay {

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previousTerm = countAndSay(n - 1);
        StringBuilder currentTerm = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == previousTerm.charAt(i - 1)) {
                count++;
            } else {
                currentTerm.append(count).append(previousTerm.charAt(i - 1));
                count = 1;
            }
        }
        
        // Append the last counted character
        currentTerm.append(count).append(previousTerm.charAt(previousTerm.length() - 1));
        
        return currentTerm.toString();
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        String result = countAndSay(n);
        System.out.println("The " + n + "th term in the count-and-say sequence is: " + result);
    }
    
}
