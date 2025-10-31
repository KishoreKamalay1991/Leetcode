public class lengthoflastword {

    public static int lengthOfLastWord(String s) {

           int lastwordlength = 0;
           
           String str = s.trim();

           for (int i = 0; i < str.length(); i++) {

             if (str.charAt(i) != ' ') {
                lastwordlength++;
             } else {
                 lastwordlength = 0;
             }

           }

           return lastwordlength;
    }

    public static void main(String[] args) {


        String s1 = "Hello Worlds";

        int lengthoflastword = lengthOfLastWord((s1));

        System.out.println(lengthoflastword);





    }

}
