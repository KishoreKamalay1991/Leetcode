import java.util.Stack;

/*

1. Lets say we have (()( the longest valid is 2 because of ().
2. Initially we insert -1 to stack then we loop if there is open bracket push the index to stack.
3. Else pop the character

*/

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // base index for valid substring

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i);
            } else {
                stack.pop(); // remove matching '(' or base
                if (stack.isEmpty()) {
                    
                    stack.push(i); // new base for next valid substring
                } else {
                    System.out.println(" i value " + i);
                    System.out.println("peek " + stack.peek());
                    System.out.println("maxLen" + maxLen);
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "(()()())";
        System.out.println("Longest Valid Parentheses Length: " + longestValidParentheses(input));
    }
}