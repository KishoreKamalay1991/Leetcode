import java.util.Stack;
/**
 * This class checks if a string containing parentheses is valid.
 * A string is considered valid if:
 * 1. Every opening parenthesis has a corresponding closing parenthesis.
 * 2. Parentheses are closed in the correct order.
 */

public class ValidParantheses {

    public static Boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        // Map to hold the pairs of parentheses
        java.util.Map<Character, Character> pairs = new java.util.HashMap<>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']');



        for (char c : s.toCharArray()) {
            // If it's an opening parenthesis, push it onto the stack
            if (pairs.containsKey(c)) {
                stack.push(c);
            } else if (pairs.containsValue(c)) {
                // If it's a closing parenthesis, check if it matches the top of the stack
                if (stack.isEmpty() || c != pairs.get(stack.pop())) {
                    return false; // Mismatch found
                }
            }
        }

        // If the stack is empty, all parentheses were matched correctly
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isValid(s)); // Output: true

        String s2 = "({[})";
        System.out.println(isValid(s2)); // Output: false


    }
    
}
