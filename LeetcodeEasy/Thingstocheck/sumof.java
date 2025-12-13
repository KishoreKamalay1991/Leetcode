package Thingstocheck;

public class sumof {

    public static int sumOf(int x) {

        int sum = 0;
        int multi = 1;
        /*while(x > 1) {
            sum += x % 10;
            x /= 10;
        }*/

        while (x > 0) {
            int digit = x % 10;   // extract last digit
            multi *= digit;     // multiply
            x /= 10;              // remove last digit
        }

        return multi;
    }

    public static void main(String[] args) {

        int x = 1234;

        int n = sumOf(x);

        System.out.println(n);

    }
}
