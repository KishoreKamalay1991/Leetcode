package Thingstocheck;

/*


You are given a string containing just the characters '(', ')', '{', '}', '[', and ']'. Write a function to determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Examples:
isValid("()") # returns True
isValid("()[]{}") # returns True
isValid("(]") # returns False
isValid("([)]") # returns False
isValid("{[]}") # returns True

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Interview {

    public static boolean isValid(String para) {

        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack S = new Stack();

        char[] arr = para.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if(map.containsKey(arr[i])) {
                S.push(arr[i]);
            } else if(map.containsValue(arr[i])) {

                if(S.isEmpty() || arr[i] != map.get(S.pop())) {
                   return false;
                }

            }


        }

        return S.isEmpty();

    }

    public static void main(String[] args) {

        Boolean res = isValid("()[]{}");



    }




}
