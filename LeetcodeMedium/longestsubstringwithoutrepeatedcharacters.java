import java.util.HashSet;
public class longestsubstringwithoutrepeatedcharacters {

    public static int lengthOfLongestSubstring(String s) {
        // Use a HashSet to store characters in the current window
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0; // To store the maximum length of substring
        int left = 0; // Left pointer of the sliding window

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, remove characters from the left
           while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            set.add(currentChar);

            // Update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(input));

        input = "bbbbb";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(input));

        input = "pwwkew";
        System.out.println("Length of Longest Substring Without Repeating Characters: " + lengthOfLongestSubstring(input));
    }
    
}
