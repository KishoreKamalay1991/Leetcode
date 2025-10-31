import java.util.Arrays;

public class findthedifference {

    public static char  findthedifference(String s, String t) {

        char[] a = s.toCharArray(), b = t.toCharArray();
        Arrays.sort(a); Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return b[i];
        }
        return b[b.length - 1];


    }


    public static void main(String[] args) {

        String s = "abcd";
        String t = "abdce";

        char diff = findthedifference(s, t);

        System.out.println(diff);



    }

}
