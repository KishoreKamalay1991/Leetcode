public class plusOne {

    public static int[] plusOne(int[] num) {



        for(int i = num.length - 1; i >= 0; i--) {

            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            num[i] = 0;
        }
        int[] res = new int[num.length + 1];

        res[0] = 1;

        return res;

    }

    public static void main(String[] args) {


        int[] digits = {9, 9};

        int[] result = plusOne(digits);

        /*for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }*/

        System.out.println(result);







    }

}
