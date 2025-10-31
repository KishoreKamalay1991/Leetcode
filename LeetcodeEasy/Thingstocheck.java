import java.util.Arrays;

public class Thingstocheck {

    public static void main(String[] args) {

        // Convert String to char array
        String str = "hello";
        char[] charArray = str.toCharArray();

        // Sort char array
        Arrays.sort(charArray);

        // Convert char array back to String
        String sortedStr = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sortedStr);

        // convert string to character
        String s = "e";
        char c = s.charAt(0);
        System.out.println("Character: " + c);


        
    }
    
}
