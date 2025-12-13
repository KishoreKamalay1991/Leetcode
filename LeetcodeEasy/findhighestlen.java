public class findhighestlen {

    public static void main(String[] args) {

        String str = "Hello kamalay how are you doing";

        int max = 0;

        int j = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                j++;
            } else {
                max = Math.max(j, max);
                j = 0;
            }
        }

        System.out.println(max);


    }

}
