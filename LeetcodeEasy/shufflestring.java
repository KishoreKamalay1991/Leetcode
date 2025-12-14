public class shufflestring {

    public static String restorestring(String str, int[] res) {

        if(str.length() == 0 || str == null) {
            return "";
        }

        if(str.length() != res.length) {

            return "";
        }

        char[] p = new char[str.length()];
        String response = "";

        for(int i = 0; i < str.length(); i++) {

          p[res[i]] = str.charAt(i);
        }

        for (int i = 0; i < str.length(); i++) {
          response += p[i];
        }


        return response;
    }

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        String result = restorestring(s, indices);
        System.out.println("result " + result);


    }

}
