public class plusOne {

    public static int[] plusOne(int[] num) {

        int length = num.length;

        double sum = 0;



        for (int i = 0; i < length; i++) {

            sum = sum + num[i] * Math.pow(10, length - i - 1);


        }

        int res = (int)sum + 1;

        String s1 = res + "";

        int[] result = new int[s1.length()];

        System.out.println(s1.length());

        for (int p = 0; p < s1.length(); p++) {
            result[p] = s1.charAt(p) - '0';

        }


        return result;

    }

    public static void main(String[] args) {


        int[] digits = {1,2,3};

        int[] result = plusOne(digits);

        System.out.println(result);







    }

}
