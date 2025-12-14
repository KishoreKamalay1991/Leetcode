import java.util.Stack;

public class removingstarsfromstring {

    public static String result(String str) {

        String res = "";

        Stack s = new Stack();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '*') {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }
        }

        for(int j = 0; j < s.size(); j++) {
          res += s.get(j);
        }

        return res;


    }
    public static void main(String[] args) {


        String s = "leet**cod*e";

        String result = result(s);

        System.out.println("result " + result);



    }

}
