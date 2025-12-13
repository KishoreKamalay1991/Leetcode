package practise;

public class sumofallnumber {

    public static void main(String[] args) {

        int n = 12345;

        String a = "abcdef";

        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            sum += (int)a.charAt(i);
        }
        System.out.println(sum);
    }

}
