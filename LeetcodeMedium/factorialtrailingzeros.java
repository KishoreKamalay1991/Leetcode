public class factorialtrailingzeros {

    public static int fact(int n) {

        int count = 0;
        int currentpowerfive = 5;

        while(n >= currentpowerfive) {
            count += (n/currentpowerfive);
            currentpowerfive *= 5;
        }

        return count;

    }

    public static void main(String[] args) {
        int n = 125;
         int result = fact(n);

         System.out.println("result " + result);
    }

}
