import java.util.Stack;

public class removeadjacentduplicatecharacter {

    public static void main(String[] args) {

        String str = "aacabba";

        char[] arr = str.toCharArray();

        Stack<Character> res = new Stack();

        for(int i = 0; i < arr.length; i++) {


            if(!res.isEmpty() && arr[i] == res.peek()) {
                res.pop();
            }

            else{
                res.push(arr[i]);
            }

        }

        String result = "";
        for(char c : res) {
            result += c;
        }

        //return result;




    }

}
