public class makeascending {

    public static long makeasc(int[] arr) {

        long cost = 0;
        long prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            long needed = prev + 1;
            System.out.println("arr[i] " + arr[i]);
            System.out.println("prev " + prev);
            System.out.println("needed " + needed);
            System.out.println("cost " + cost);
            if (arr[i] < needed) {
                cost += needed - arr[i];
                prev = needed;
            } else {
                prev = arr[i];
            }
        }
        return cost;

    }

    public static void main(String[] args) {

        int[] num = {1,4,3,2};
        long minasc = makeasc(num);
        System.out.println("minasc " + minasc);

    }

}
