package Thingstocheck;

public class binaryNumber {

    // for example 1011 will stands like if character is 1 then 2 power 0 + 2 power 1 + 2 power 3

    public static void main (String[] args) {
        String binary = "1011";
        int sum = 0;
        int count = 0;
        for (int i = binary.length() - 1; i >=0 ; i--) {
            if (binary.charAt(i) == '1') {
                sum += Math.pow(2, count);

            }
            count++;

        }

        System.out.println("sum = " + sum);

    }
}
