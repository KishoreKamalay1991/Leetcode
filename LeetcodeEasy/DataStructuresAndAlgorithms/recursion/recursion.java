package DataStructuresAndAlgorithms.recursion;

public class recursion {

    public static int recursion(int n) {


        if (n == 1) {

            return 1;

        }

        int result = n * recursion(n - 1);

        return result;

    }

    public static void main(String[] args) {

        int n = 5;

        int result = recursion(n);

        System.out.println(result);

    }

}
