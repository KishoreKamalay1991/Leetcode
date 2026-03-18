import java.util.*;

public class lettercombi {

private static final Map<Character, String> KEYPAD = Map.of(
		'2', "abc",
		'3', "def",
		'4', "ghi",
		'5', "jkl",
		'6', "mno",
		'7', "pqrs",
		'8', "tuv",
		'9', "wxyz"
);

public static List<String> letterCombinations(String digits) {
	List<String> result = new ArrayList<>();
	if (digits == null || digits.length() == 0) {
		return result;
	}
	backtrack(digits, 0, "", result);
	return result;
}

private static void backtrack(String digits, int index,
							  String current, List<String> result) {
	
	// base case
	if (index == digits.length()) {
		result.add(current);
		return;
	}
	
	String letters = KEYPAD.get(digits.charAt(index));
	System.out.println("letters " + letters);
	for (char c : letters.toCharArray()) {
		System.out.println("current " + current);
		System.out.println("C value " + c);
		backtrack(digits, index + 1, current + c, result);
	}
}

public static void main(String[] args) {
	System.out.println(letterCombinations("23"));
}
}

