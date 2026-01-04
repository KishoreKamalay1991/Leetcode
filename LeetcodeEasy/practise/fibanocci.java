package practise;

public class fibanocci {

    public static int fibanucci(int n) {

        if (n == 0) return 0;

        if(n == 1) {

            return 1;

        }


        int result = fibanucci(n - 1) + fibanucci( n - 2 );

        //System.out.println(result);

        return result;

    }

    public static void main(String[] args) {

        int n = 6;
        int result = fibanucci(n);
            System.out.println(result);

    }

}
