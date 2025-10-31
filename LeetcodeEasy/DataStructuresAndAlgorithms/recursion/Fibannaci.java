package DataStructuresAndAlgorithms.recursion;

public class Fibannaci {

    public static int fibannaci(int n) {

        if (n <= 1)
            return n;
        return fibannaci(n - 1) + fibannaci(n - 2);

    }

    public static void main(String[] args) {


     int res = fibannaci(10);

     System.out.println(res);
        


    }

}
